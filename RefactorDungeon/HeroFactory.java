import java.util.Scanner;

public class HeroFactory{
   static Scanner scan = new Scanner(System.in);

   public static Hero createHero()
   {
      String choice, name = getNameInput();
      Hero hero = null;
      int hitPoints, attackSpeed, damageMin, damageMax;
      double chanceToHit, chanceToBlock;

		while(hero == null)
		{
			System.out.println("Choose a hero:\n" +
                        "1. Warrior\n" +
                        "2. Sorceress\n" +
                        "3. Thief");
         choice = scan.nextLine();

         if(choice.equals("1"))
         {
            hero = new Warrior(name);
         }
         else if(choice.equals("2"))
         {
            hero = new Sorceress(name);
         }
         else if(choice.equals("3"))
         {
            hero = new Thief(name);
         }
         else
         {
            System.out.println("Incorrect choice, choose again");
         }
      }
      return hero;
   }
   
   private static String getNameInput(){
      System.out.print("Enter character name: ");
      return scan.nextLine();
   }
}