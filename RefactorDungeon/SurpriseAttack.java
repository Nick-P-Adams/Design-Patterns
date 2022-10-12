
public class SurpriseAttack implements Attack 
{
   public void attack(DungeonCharacter attacker, DungeonCharacter defender)
   {
      double surprise = Math.random();
      if(surprise >= .9)
      {
         System.out.println("Uh oh! " + defender.getName() + " saw you and" +
                                    " blocked your attack!");
      }else{
         if (surprise <= .4)
         {
            System.out.println("Stealth successful!\n" +
                               attacker.getName() + " gets an additional turn.");
    		
            ((Hero)attacker).setNumTurns(((Hero)attacker).getNumTurns() + 1);
         }
         boolean canAttack;
         int damage;

         canAttack = Math.random() <= attacker.getChanceToHit();

         if (canAttack)
         {
            damage = (int)(Math.random() * (attacker.getDamageMax() - attacker.getDamageMin() + 1))
                     + attacker.getDamageMin();
            defender.subtractHitPoints(damage);

            System.out.println();
         }//end if can attack
         else
         {

            System.out.println(attacker.getName() + "'s attack on " + defender.getName() +
                           " failed!");
            System.out.println();
         }//end else
      }
   }
   
   public String getName(){
      return "Surprise Attack";
   }
}
