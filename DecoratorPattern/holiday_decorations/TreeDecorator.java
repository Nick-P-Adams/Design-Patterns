package holiday_decorations;

public abstract class TreeDecorator implements HolidayItem 
{
	private HolidayItem wrappedItem;
	
	public HolidayItem getItem(){return wrappedItem;};
	public void setItem(HolidayItem item){this.wrappedItem = item;}
	public Double cost() {return null;};
}
