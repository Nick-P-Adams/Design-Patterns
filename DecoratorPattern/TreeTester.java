import holiday_decorations.*;

public class TreeTester 
{
	public static void main(String[] args) 
	{
		HolidayItem tree = new ColoradoBlueSpruce(), tree2 = new DouglasFir();
		
		tree = Star.getStar(tree);
		tree = Star.getStar(tree);
		tree = new Ruffles(tree);
		tree = new SilverBalls(tree);
		tree = new LEDS(tree);
		
		System.out.println(tree.toString() + "Total Cost:     $" + tree.cost() + "\r\n");
		
		tree2 = Star.getStar(tree2);
		tree2 = new Ruffles(tree2);
		tree2 = new SilverBalls(tree2);
		tree2 = new SilverBalls(tree2);
		tree2 = new Ribbons(tree2);
		tree2 = new BlueBalls(tree2);
		tree2 = new LEDS(tree2);
		tree2 = new Lights(tree2);
		
		System.out.println(tree2.toString() + "Total Cost:     $" + tree2.cost() + "\r\n");
	}

}
