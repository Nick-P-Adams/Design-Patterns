
public class GiantLizard extends Monster 
{

	public GiantLizard(String name, int hitPoints, int attackSpeed, double chanceToHit, 
            double chanceToHeal, int damageMin, int damageMax, int minHeal, int maxHeal, Attack... attacks)
	{
		super(name, "Giant Lizard", hitPoints, attackSpeed, chanceToHit, chanceToHeal, damageMin, damageMax, minHeal, maxHeal, attacks);
	}
	@Override
	protected void battleChoices(DungeonCharacter opponent) 
	{
		System.out.println(super.getName() + " makes a bite attack at " +
				opponent.getName() + ":");
		super.setAttack(1);
		super.getAttack().attack(this, opponent);

	}

}
