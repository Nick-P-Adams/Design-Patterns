
public abstract class Monster extends DungeonCharacter
{
	private double chanceToHeal;
	private int minHeal, maxHeal;

  public Monster(String name, String className, int hitPoints, int attackSpeed,
				     double chanceToHit, double chanceToHeal,
					 int damageMin, int damageMax,
					 int minHeal, int maxHeal, Attack... attacks)
  {
	super(name, className, hitPoints, attackSpeed, chanceToHit, damageMin, damageMax, attacks);
	this.chanceToHeal = chanceToHeal;
	this.maxHeal = maxHeal;
	this.minHeal = minHeal;
  }
  
  private void heal()
  {
	boolean canHeal = canHeal();

	if (canHeal)
	{
		int pointsHealed = healPoints();
		addHitPoints(pointsHealed);
		System.out.println(healOutput(pointsHealed));
	}
	
  }
  
  private String healOutput(int pointsHealed)
  {
	  return super.getName() + " healed itself for " + pointsHealed + " points.\n" + "Total hit points remaining are: " + super.getHitPoints() + "\n";
  }
  
  private boolean canHeal() 
  {
	  return (Math.random() <= chanceToHeal) && (super.getHitPoints() > 0);
  }
  
  private int healPoints()
  {
	  return (int)(Math.random() * (maxHeal - minHeal + 1)) + minHeal;
  }
 
 public void subtractHitPoints(int hitPoints)
 {
		super.subtractHitPoints(hitPoints);
		heal();
 }

}