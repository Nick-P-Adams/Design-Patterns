package holiday_decorations;

public class LEDS extends TreeDecorator implements HolidayItem 
{
	public LEDS(HolidayItem item)
	{
		super.setItem(item);
	}
	
	public Double cost() 
	{
		return super.getItem().cost() + 10.00;
	}
	
	@Override
	public String toString()
	{
		return super.getItem().toString() + "-LEDS:          $10\r\n";
	}

}
