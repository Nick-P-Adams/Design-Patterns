
public abstract class Character 
{
	private GuitarType guitar;
	private SoloBehavior solo;
	private String name;
	
	public Character(final GuitarType guitar, final SoloBehavior solo, final String name)
	{
		this.guitar = guitar;
		this.solo = solo;
		this.name = name;
	}
	
	public void setGuitarType(final GuitarType guitar)
	{
		this.guitar = guitar;
	}
	
	public void setSoloBehavior(final SoloBehavior solo)
	{
		this.solo = solo;
	}
	
	public String toString()
	{
		return this.name + " playing a " + guitar.toString() + " during the solo " + solo.toString() + "\r\n";
	}
}
