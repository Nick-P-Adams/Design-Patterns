package holiday_decorations;

public class Lights extends TreeDecorator implements HolidayItem 
{
	public Lights(HolidayItem item)
	{
		super.setItem(item);
	}
	
	public Double cost() 
	{
		return super.getItem().cost() + 5.00;
	}
	
	@Override
	public String toString()
	{
		return super.getItem().toString() + "-Lights:        $5\r\n";
	}

}
