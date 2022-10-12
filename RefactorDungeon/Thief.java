public class Thief extends Hero
{
   public Thief(String name)
   {
      //super(name, className, hitPoints, attackSpeed, chanceToHit, damageMin, damageMax, chanceToBlock, attacks...);
      super(name, "Thief", 75, 6, 0.8, 20, 40, 0.4, new RegularAttack(), new SurpriseAttack());
   }
}