package holiday_decorations;

public class ColoradoBlueSpruce implements HolidayItem 
{
	@Override
	public Double cost() 
	{
		return 50.00;
	}
	
	@Override
	public String toString()
	{
		return "Tree: Colorado Blue Spruce\r\n";
	}
}
