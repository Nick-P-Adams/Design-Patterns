package holiday_decorations;

public class RedBalls extends TreeDecorator implements HolidayItem 
{
	public RedBalls(HolidayItem item)
	{
		super.setItem(item);
	}
	
	public Double cost() 
	{
		return super.getItem().cost() + 1.00;
	}
	
	@Override
	public String toString()
	{
		return super.getItem().toString() + "-Red Balls:    $1\r\n";
	}

}
