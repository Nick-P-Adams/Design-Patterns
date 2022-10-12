package shapes;

public class Circle extends Shape 
{
	protected Circle(String name, double d1)
	{
		super(name, d1, Math.PI);
	}

	@Override
	protected double area() 
	{
		return (super.d1 * super.d1) * super.d2;
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
