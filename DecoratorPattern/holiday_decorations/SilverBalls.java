package holiday_decorations;

public class SilverBalls extends TreeDecorator implements HolidayItem 
{
	public SilverBalls(HolidayItem item)
	{
		super.setItem(item);
	}
	
	public Double cost() 
	{
		return super.getItem().cost() + 3.00;
	}
	
	@Override
	public String toString()
	{
		return super.getItem().toString() + "-Silver Balls:  $3\r\n";
	}

}
