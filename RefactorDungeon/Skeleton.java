
public class Skeleton extends Monster
{

    public Skeleton(String name, int hitPoints, int attackSpeed, double chanceToHit, 
                    double chanceToHeal, int damageMin, int damageMax, int minHeal, int maxHeal, Attack... attacks)
	{
		super(name, "Skeleton", hitPoints, attackSpeed, chanceToHit, chanceToHeal, damageMin, damageMax, minHeal, maxHeal, attacks);

    }

	@Override
	protected void battleChoices(DungeonCharacter opponent) 
	{
		System.out.println(super.getName() + " slices his rusty blade at " +
				opponent.getName() + ":");
		super.setAttack(1);
		super.getAttack().attack(this, opponent);
	}


}