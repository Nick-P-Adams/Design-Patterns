
public class Ogre extends Monster
{

    public Ogre(String name, int hitPoints, int attackSpeed, double chanceToHit, 
                double chanceToHeal, int damageMin, int damageMax, int minHeal, int maxHeal, Attack... attacks)
	{
		super(name, "Ogre", hitPoints, attackSpeed, chanceToHit, chanceToHeal, damageMin, damageMax, minHeal, maxHeal, attacks);


    }

	@Override
	protected void battleChoices(DungeonCharacter opponent) 
	{
		System.out.println(super.getName() + " slowly swings a club toward's " +
				opponent.getName() + ":");
		super.setAttack(1);
		super.getAttack().attack(this, opponent);
	}
}