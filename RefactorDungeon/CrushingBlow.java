
public class CrushingBlow implements Attack 
{

	@Override
	public void attack(DungeonCharacter attacker, DungeonCharacter defender) 
	{
		if (Math.random() <= .4)
		{
			int blowPoints = (int)(Math.random() * 76) + 100;
			System.out.println(attacker.getName() + " lands a CRUSHING BLOW for " + blowPoints
								+ " damage!");
			defender.subtractHitPoints(blowPoints);
		}
		else
		{
			System.out.println(attacker.getName() + " failed to land a crushing blow");
			System.out.println();
		}
	}
   
   public String getName(){
      return "Crushing Blow";
   }

}
