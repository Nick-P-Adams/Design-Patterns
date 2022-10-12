public class Sorceress extends Hero
{
   public Sorceress(String name)
   {
      //super(name, className, hitPoints, attackSpeed, chanceToHit, damageMin, damageMax, chanceToBlock, attacks...);
      super(name, "Sorceress", 75, 5, 0.7, 25, 45, 0.3, new FireBall(), new Heal());
   }
}