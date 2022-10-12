package holiday_decorations;

public class Ruffles extends TreeDecorator implements HolidayItem 
{
	public Ruffles(HolidayItem item)
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
		return super.getItem().toString() + "-Ruffles:       $1\r\n";
	}

}
