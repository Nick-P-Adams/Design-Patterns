package holiday_decorations;

public class Star extends TreeDecorator implements HolidayItem 
{
	private Star(HolidayItem item)
	{
		super.setItem(item);
	}
	
	public Double cost() 
	{
		return super.getItem().cost() + 4.00;
	}
	
	@Override
	public String toString()
	{
		return super.getItem().toString() + "-Star:          $4\r\n";
	}
	
	public static HolidayItem getStar(HolidayItem item)
	{
		String test = item.toString();
		test = test.toLowerCase();
		
		if(test.contains("star"))
		{
			System.out.println("The tree already has a star. THERE CAN ONLY BE ONE!");
		}
		else
		{
			item = new Star(item);
		}
		
		return item;
	}

}
