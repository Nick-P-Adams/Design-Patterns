import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.awt.Point;

public abstract class Hero extends DungeonCharacter
{
	private double chanceToBlock;
	private int numTurns, healingPotionCount, visionPotionCount, pillarsFoundCount, potionHealAmount;
   private boolean visionPotionActive = false;
   private Point location = new Point();

   public Hero(String name, String className, int hitPoints, int attackSpeed,
				     double chanceToHit, int damageMin, int damageMax,
					  double chanceToBlock, Attack... attacks)
   {
	   super(name, className, hitPoints, attackSpeed, chanceToHit, damageMin, damageMax, attacks);
      this.chanceToBlock = chanceToBlock;
      this.healingPotionCount = 1;
      this.visionPotionCount = 0;
      this.pillarsFoundCount = 0;
      this.potionHealAmount = 35;
   }

   private boolean defend()
   {
		return Math.random() <= chanceToBlock;
   }

   public void subtractHitPoints(int hitPoints)
	{
		if (defend())
		{
			System.out.println(super.getName() + " BLOCKED the attack!");
		}
		else
		{
			super.subtractHitPoints(hitPoints);
		}

	}
   
   public void displayTurnCount(DungeonCharacter opponent){
      numTurns = super.getAttackSpeed()/opponent.getAttackSpeed();

		if (numTurns == 0)
			numTurns++;

		System.out.println("Number of turns this round is: " + numTurns);
   }

	public void battleChoices(DungeonCharacter opponent)
	{
      displayTurnCount(opponent);
      
      Scanner scan = new Scanner(System.in);
      int choice;
      ArrayList<String> attackNames = super.getAttackNames();

      do
      {
         int attackCount = 1;
         for(String name : attackNames){
            System.out.println(attackCount + ". " + name);
            attackCount++;
         }
         System.out.print("Choose an option: ");

         try{
            choice = scan.nextInt();
            if(choice > 0 && choice <= super.getNumberOfAttacks()){
               super.setAttack(choice);
               super.getAttack().attack(this, opponent);
            }
            else{
               System.out.println("invalid choice! Turn forfeited!");
            }
         }catch(InputMismatchException e){
            System.out.println("Invalid input! Input must be an integer! Turn forfeited!");
         }

         numTurns--;
         if (numTurns > 0)
            System.out.println("Number of turns remaining is: " + numTurns);

      } while(numTurns > 0);
	}
	
	public int getNumTurns()
	{
		return this.numTurns;
	}
	
	public void setNumTurns(int numTurns)
	{
		this.numTurns = numTurns;
	}
   
   public void useHealingPotion(){
      if(this.healingPotionCount < 1){
         System.out.println("No healing potion available!");
      }
      else if(super.getHitPoints() == super.getMaxHitPoints()){
         System.out.println("Already at max health!");
      }
      else{
         super.addHitPoints(potionHealAmount);
         this.healingPotionCount--;
      }
   }
   
   public void addHealingPotion(){
      this.healingPotionCount++;
   }
   
   public void addPillarFound(){
      this.pillarsFoundCount++;
   }
   
   public void addVisionPotion(){
      this.visionPotionCount++;
   }
   
   public void useVisionPotion(){
      if(this.visionPotionCount < 1){
         System.out.println("No vision potion available!");
      }
      else{
         this.visionPotionActive = true;
         this.visionPotionCount--;
      }
   }
   
   public boolean visionPotionActive(){
      return this.visionPotionActive;
   }
   
   public Point getLocation(){
      return this.location.getLocation();
   }
   
   public void move(int dx, int dy){
      if(!validLocation((int)this.location.getX() + dx, (int)this.location.getY() + dy)){
         System.out.println("You walked into a wall. Good job.");
      }
      else{
         this.location.translate(dx, dy);
         this.visionPotionActive = false;
      }
   }
   
   private boolean validLocation(int x, int y){
      if(x < 0 || x > 4 || y < 0 || y > 4){
         return false;
      }
      return true;
   }
   
   @Override
   public String toString(){
      return "Name: " + super.getName() + "\n" + 
             "HitPoints: " + super.getHitPoints() + "/" + super.getMaxHitPoints() + "\n" + 
             "Healing Potions: " + this.healingPotionCount + "\n" + 
             "Vision Potions: " + this.visionPotionCount + "\n" + 
             "Pillars of OO found: " + this.pillarsFoundCount;
   }
}