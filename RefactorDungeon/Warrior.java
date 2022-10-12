public class Warrior extends Hero
{
   public Warrior(String name)
   {
      //super(name, className, hitPoints, attackSpeed, chanceToHit, damageMin, damageMax, chanceToBlock, attacks...);
      super(name, "Warrior", 125, 4, 0.8, 35, 60, 0.2, new RegularAttack(), new CrushingBlow());
   }
}