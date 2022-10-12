
public class Heal implements Attack 
{
	private final int MIN_ADD = 25;
	private final int MAX_ADD = 50;

	@Override
	public void attack(DungeonCharacter attacker, DungeonCharacter defender) 
	{
		   int hPoints;

			hPoints = (int)(Math.random() * (MAX_ADD - MIN_ADD + 1)) + MIN_ADD;
			attacker.addHitPoints(hPoints);
			System.out.println(attacker.getName() + " added [" + hPoints + "] points.\n"
								+ "Total hit points remaining are: "
								+ attacker.getHitPoints());
			System.out.println();
	}
   
   public String getName(){
      return "Heal";
   }
}
