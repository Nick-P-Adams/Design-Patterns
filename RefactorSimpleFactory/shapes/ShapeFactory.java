package shapes;

public class ShapeFactory 
{
	private Shape s;
	
	public Shape createShape(String name, double d1, double d2)
	{
		if(name.toLowerCase().compareTo("triangle") == 0)
		{
			this.s = new Triangle(name, d1, d2);
		}
		else if(name.toLowerCase().compareTo("rectangle") == 0)
		{
			this.s = new Rectangle(name, d1, d2);
		}
		else if(name.toLowerCase().compareTo("square") == 0)
		{
			this.s = new Square(name, d1, d2);
		}
		else if(name.toLowerCase().compareTo("circle") == 0)
		{
			this.s = new Circle(name, d1);
		}
		else
		{
			throw new IllegalArgumentException("Shape does not exist in factory.");
		}
		
		return this.s;
	}
}
