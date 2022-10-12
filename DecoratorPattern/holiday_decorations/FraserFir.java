package holiday_decorations;

public class FraserFir implements HolidayItem 
{
	@Override
	public Double cost() 
	{
		return 35.00;
	}
	
	@Override
	public String toString()
	{
		return "Tree: Fraser Fir\r\n";
	}
}
