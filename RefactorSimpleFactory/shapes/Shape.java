package shapes;

public abstract class Shape implements Comparable<Shape>
{
	protected String name;
	protected double d1, d2;
	
	protected Shape(String name, double d1, double d2)
	{
		if(name.toLowerCase().compareTo("square") == 0 && d1 != d2)
		{
			throw new IllegalArgumentException("Sides are not equal this is not a square");
		}
		
		this.name = name;
		this.d1 = d1;
		this.d2 = d2;
	}
	 
	protected abstract double area();
	public abstract String toString();
}
