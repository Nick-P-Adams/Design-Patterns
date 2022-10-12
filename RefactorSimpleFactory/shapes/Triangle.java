package shapes;

public class Triangle extends Shape 
{
	protected Triangle(String name, double d1, double d2)
	{
		super(name, d1, d2);
	}

	@Override
	protected double area() 
	{
		return 0.5 * (super.d1*super.d2);
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
