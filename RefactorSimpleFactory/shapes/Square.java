package shapes;

public class Square extends Shape 
{
	protected Square(String name, double d1, double d2)
	{
		super(name, d1, d2);
	}

	@Override
	protected double area() 
	{
		return super.d1 * super.d2;
	}

	@Override
	public String toString() 
	{
		return super.name + " with area: "+ this.area();
	}

	@Override
	public int compareTo(Shape o) 
	{
		if(this.name.compareTo(o.name) < 0)
		{
			return -1;
		}
		else if(this.name.compareTo(o.name) > 0)
		{
			return 1;
		}
		
		return 0;
	}

}
