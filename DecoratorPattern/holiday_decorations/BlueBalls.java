package holiday_decorations;

public class BlueBalls extends TreeDecorator implements HolidayItem 
{
	public BlueBalls(HolidayItem item)
	{
		super.setItem(item);
	}
	
	public Double cost() 
	{
		return super.getItem().cost() + 2.00;
	}
	
	@Override
	public String toString()
	{
		return super.getItem().toString() + "-Blue Balls:    $2\r\n";
	}

}
