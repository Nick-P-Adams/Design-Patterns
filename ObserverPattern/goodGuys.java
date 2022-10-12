
public class goodGuys 
{
	private int hobbits, elves, dwarves, men;
	
	public goodGuys(final int hobbits, final int elves, final int dwarves, final int men)
	{
		this.hobbits = hobbits;
		this.elves = elves; 
		this.dwarves = dwarves;
		this.men = men;
	}
	
	public String toString()
	{
		return (hobbits + " Hobbits, " + elves + " Elves, " + dwarves + " Dwarves, " + men + " Men");
	}

}
