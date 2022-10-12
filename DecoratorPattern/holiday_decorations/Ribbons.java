package holiday_decorations;

public class Ribbons extends TreeDecorator implements HolidayItem 
{
	public Ribbons(HolidayItem item)
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
		return super.getItem().toString() + "-Ribbons:       $2\r\n";
	}

}
