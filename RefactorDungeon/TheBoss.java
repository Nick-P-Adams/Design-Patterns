import java.util.Random;
public class TheBoss extends Monster 
{
	Random ran = new Random();
	public TheBoss(String name, int hitPoints, int attackSpeed, double chanceToHit, 
            double chanceToHeal, int damageMin, int damageMax, int minHeal, int maxHeal, Attack... attacks)
	{
		super(name, "The Boss", hitPoints, attackSpeed, chanceToHit, chanceToHeal, damageMin, damageMax, minHeal, maxHeal, attacks);
	}
	@Override
	protected void battleChoices(DungeonCharacter opponent) 
	{
		int choice = ran.nextInt(4);
		if(choice == 0) 
		{
		System.out.println(super.getName() + " makes a bite attack at " +
				opponent.getName() + ":");
		}
		else if(choice == 1)
		{
			System.out.println(super.getName() + " makes a claw attack at " +
					opponent.getName() + ":");
		}
		else if(choice == 2)
		{
			System.out.println(super.getName() + " makes a tail attack at " +
					opponent.getName() + ":");
		}
		else
		{
			System.out.println(super.getName() + " exhales fire at " +
					opponent.getName() + ":");
		}
		super.setAttack(1);
		super.getAttack().attack(this, opponent);

	}

}
