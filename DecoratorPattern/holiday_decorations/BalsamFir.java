package holiday_decorations;

public class BalsamFir implements HolidayItem 
{
	@Override
	public Double cost() 
	{
		return 25.00;
	}
	
	@Override
	public String toString()
	{
		return "Tree: Balsam Fir\r\n";
	}
}
