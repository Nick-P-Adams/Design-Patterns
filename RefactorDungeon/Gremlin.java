
public class Gremlin extends Monster
{

    public Gremlin(String name, int hitPoints, int attackSpeed, double chanceToHit, 
                   double chanceToHeal, int damageMin, int damageMax, int minHeal, int maxHeal, Attack... attacks)
	{
		super(name, "Gremlin", hitPoints, attackSpeed, chanceToHit, chanceToHeal, damageMin, damageMax, minHeal, maxHeal, attacks);

    }

	@Override
	protected void battleChoices(DungeonCharacter opponent) 
	{
		System.out.println(super.getName() + " jabs his kris at " +
				opponent.getName() + ":");
		super.setAttack(1);
		super.getAttack().attack(this, opponent);
	}
}