package holiday_decorations;

public class DouglasFir implements HolidayItem 
{
	@Override
	public Double cost() 
	{
		return 30.00;
	}
	
	@Override
	public String toString()
	{
		return "Tree: Douglas Fir\r\n";
	}
}
