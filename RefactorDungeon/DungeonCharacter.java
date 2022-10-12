import java.util.ArrayList;

public abstract class DungeonCharacter
{

	private String name, className;
	private int hitPoints, maxHitPoints, attackSpeed, damageMin, damageMax;
	private double chanceToHit;
	private Attack attack;
   private ArrayList<Attack> attacks = new ArrayList<Attack>();

	public DungeonCharacter(String name, String className, int hitPoints, int attackSpeed,
				     double chanceToHit, int damageMin, int damageMax, Attack... attacks)
	{
		this.name = name;
      this.className = className;
		this.hitPoints = hitPoints;
      this.maxHitPoints = hitPoints;
		this.attackSpeed = attackSpeed;
		this.chanceToHit = chanceToHit;
		this.damageMin = damageMin;
		this.damageMax = damageMax;

      for(Attack attack : attacks){
         this.attacks.add(attack);
      }
	}

	public void addHitPoints(int hitPoints)
	{
		if (hitPoints <=0)
			System.out.println("Hitpoint amount must be positive.");
		else
		{
			this.hitPoints += hitPoints;
         if(this.hitPoints > maxHitPoints){
            this.hitPoints = maxHitPoints;
         }
		}
	}

	public void subtractHitPoints(int hitPoints)
	{
		if (hitPoints <0)
			System.out.println("Hitpoint amount must be positive.");
		else if (hitPoints >0)
		{
			this.hitPoints -= hitPoints;
			if (this.hitPoints < 0)
				this.hitPoints = 0;
			System.out.println(name + " was hit " +
								"for <" + hitPoints + "> points of damage.");
			System.out.println(name + " now has " +
								this.hitPoints + " hit points remaining.");
			System.out.println();
		}

		if (this.hitPoints == 0)
			System.out.println(name + " has been killed :-(");
	}

   public boolean isAlive()
	{
	   return (hitPoints > 0);
	}

	public String getName()
	{
		return this.name;
	}
   
   public String getFullName(){
      return this.name + " the " + this.className;
   }

	public int getHitPoints()
	{
		return this.hitPoints;
	}
   
   public int getMaxHitPoints(){
      return this.maxHitPoints;
   }

	public int getAttackSpeed()
	{
		return this.attackSpeed;
	}
	
	public double getChanceToHit()
	{
		return this.chanceToHit;
	}
	
	public int getDamageMin()
	{
		return this.damageMin;
	}
	
	public int getDamageMax()
	{
		return this.damageMax;
	}
	
	public Attack getAttack()
	{
		return this.attack;
	}
	
	protected void setAttack(int choice)
	{
		this.attack = attacks.get(choice - 1);
	}
   
   public ArrayList<String> getAttackNames(){
      ArrayList<String> attackNames = new ArrayList<String>();
      for(Attack attack : this.attacks){
         attackNames.add(attack.getName());
      }
      return attackNames;
   }
   
   public int getNumberOfAttacks(){
      return this.attacks.size();
   }

	protected abstract void battleChoices(DungeonCharacter opponent);

}