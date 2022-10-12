
public class RegularAttack implements Attack
{
	@Override
	public void attack(DungeonCharacter attacker, DungeonCharacter defender) 
	{
		boolean canAttack;
		int damage;

		canAttack = Math.random() <= attacker.getChanceToHit();

		if (canAttack)
		{
			System.out.println(attacker.getName() + " manages to perform a very average attack at " +
					defender.getName() + ":");
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
   
   public String getName(){
      return "Regular Attack";
   }

}
