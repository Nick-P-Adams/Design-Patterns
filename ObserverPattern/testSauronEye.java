
public class testSauronEye {

	public static void main(String[] args) 
	{
		theEye eye = new theEye();
		badGuys saruman = new badGuys(eye, "Saruman");
		badGuys witchKing = new badGuys(eye, "Witch King");
		
		eye.setGoodGuys(1, 2, 3, 4);
		eye.setGoodGuys(100, 1, 20, 50);
		
		saruman.defeated();
		
		eye.setGoodGuys(10000, 10000, 10000, 10000);
	}

}
