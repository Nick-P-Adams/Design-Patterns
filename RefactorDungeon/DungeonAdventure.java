
import java.util.Scanner;

public class DungeonAdventure
{
   private static Scanner scan = new Scanner(System.in);
   
   public static void main(String[] args)
   {
    	
      Hero theHero;
      Monster theMonster;
      Dungeon dungeon = new Dungeon();
      
      dungeon.print();

      do
      {
         theHero = HeroFactory.createHero();
         theMonster = MonsterFactory.createMonster();
         battle(theHero, theMonster);
      } while (playAgain());

   }

   public static boolean playAgain()
   {
      String again;

      System.out.println("Play again (y/n)?");
      again = scan.nextLine();

      return (again.equals("Y") || again.equals("y"));
   }

   public static void battle(DungeonCharacter theHero, DungeonCharacter theMonster)
   {
      String pause = "p";
      System.out.println(theHero.getFullName() + " battles " + theMonster.getFullName());
      System.out.println("---------------------------------------------");

      while (theHero.isAlive() && theMonster.isAlive() && !pause.equals("q"))
      {
         theHero.battleChoices(theMonster);

         if (theMonster.isAlive())
            theMonster.battleChoices(theHero);

         System.out.print("\n-->q to quit, anything else to continue: ");
         pause = scan.nextLine();

      }

      if (!theMonster.isAlive())
         System.out.println(theHero.getName() + " was victorious!");
      else if (!theHero.isAlive())
         System.out.println(theHero.getName() + " was defeated :-(");
      else
         System.out.println("Quitters never win ;-)");

   }

}