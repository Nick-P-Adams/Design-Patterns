
public class StrategyPatternMain 
{

	public static void main(String[] args) 
	{
		GuitarType guitar, guitar2;
		SoloBehavior solo, solo2; 
		
		Character player1 = new JimiHendrix(guitar = new GibsonFlyingV(), solo = new SmashGuitar());
		Character player2 = new Slash(guitar2 = new GibsonSG(), solo2 = new GuitarOnFire());
		
		System.out.println("---------------------\r\n" + "Game Start" + "\r\n---------------------");
		System.out.println(player1.toString());
		System.out.println(player2.toString());
		
		player1.setGuitarType(guitar = new FenderTelecaster());
		player1.setSoloBehavior(solo = new GuitarOnFire());
		
		player2.setGuitarType(guitar2 = new GibsonFlyingV());
		player2.setSoloBehavior(solo2 = new JumpOffStage());
		
		System.out.println("---------------------\r\n" + "Change Guitar and Solo Behavior" + "\r\n---------------------");
		System.out.println(player1.toString());
		System.out.println(player2.toString());
		
		player1 = new AngusYoung(guitar, solo);
		player2 = new JimiHendrix(guitar2, solo2);
		
		System.out.println("---------------------\r\n" + "Change Characters keep Guitar and Solo Behavior" + "\r\n---------------------");
		System.out.println(player1.toString());
		System.out.println(player2.toString());
		

	}

}
