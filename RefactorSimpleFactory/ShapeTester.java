import java.util.ArrayList;
import java.util.Collections;
import shapes.ShapeFactory;

public class ShapeTester 
{
	public static void main(String[] args) 
	{
		ArrayList<Comparable> shapes = new ArrayList<Comparable>(); 
		ShapeFactory sf = new ShapeFactory();
		
		shapes.add(sf.createShape("triangle", 2, 4));
		shapes.add(sf.createShape("circle", 100, 0.0));
		shapes.add(sf.createShape("rectangle", 20, 10));
		shapes.add(sf.createShape("square", 5, 5));
		shapes.add(sf.createShape("triangle", 200, 10));
		shapes.add(sf.createShape("circle", 10, 0.0));
		shapes.add(sf.createShape("rectangle", 20, 35));
		shapes.add(sf.createShape("triangle", 200, 400));
		
		Collections.sort(shapes);
		
		for(Comparable s: shapes)
		{
			System.out.println(s.toString());
		}

	}

}
