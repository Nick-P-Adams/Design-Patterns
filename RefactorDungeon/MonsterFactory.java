import java.util.ArrayList;

public class MonsterFactory{
   
   public static Monster createMonster()
   {
      int choice;
      int hitPoints, attackSpeed, damageMin, damageMax, minHeal, maxHeal;
      double chanceToHit, chanceToHeal;
      String monsterName = randomMonsterName();
      Monster monster = null;

      choice = (int)(Math.random() * 3);

      if(choice == 0)
      {
         hitPoints = 200;
         attackSpeed = 2;
         chanceToHit = 0.6;
         chanceToHeal = 0.1;
         damageMin = 30;
         damageMax = 60;
         minHeal = 30;
         maxHeal = 60;
         
         monster = new Ogre(monsterName, hitPoints, attackSpeed, chanceToHit, chanceToHeal, damageMin, damageMax, minHeal, maxHeal, new RegularAttack());
      }
      else if(choice == 1)
      {
         hitPoints = 70;
         attackSpeed = 5;
         chanceToHit = 0.8;
         chanceToHeal = 0.4;
         damageMin = 15;
         damageMax = 30;
         minHeal = 20;
         maxHeal = 40;
         
         monster = new Gremlin(monsterName, hitPoints, attackSpeed, chanceToHit, chanceToHeal, damageMin, damageMax, minHeal, maxHeal, new RegularAttack());
      }
      else if(choice == 2)
      {
         hitPoints = 100;
         attackSpeed = 3;
         chanceToHit = 0.8;
         chanceToHeal = 0.3;
         damageMin = 30;
         damageMax = 50;
         minHeal = 30;
         maxHeal = 50;
         
         monster = new Skeleton(monsterName, hitPoints, attackSpeed, chanceToHit, chanceToHeal, damageMin, damageMax, minHeal, maxHeal, new RegularAttack());
      }
      else if(choice == 3)
      {
    	  hitPoints = 124;
          attackSpeed = 4;
          chanceToHit = 0.8;
          chanceToHeal = 0.2;
          damageMin = 25;
          damageMax = 47;
          minHeal = 27;
          maxHeal = 50;
          
          monster = new GiantLizard(monsterName, hitPoints, attackSpeed, chanceToHit, chanceToHeal, damageMin, damageMax, minHeal, maxHeal, new RegularAttack());
      }
      else
      {
    	  hitPoints = 200;
          attackSpeed = 5;
          chanceToHit = 0.8;
          chanceToHeal = 0.4;
          damageMin = 30;
          damageMax = 60;
          minHeal = 30;
          maxHeal = 60;
          
          monster = new TheBoss(monsterName, hitPoints, attackSpeed, chanceToHit, chanceToHeal, damageMin, damageMax, minHeal, maxHeal, new RegularAttack());
      }
      return monster;
   }
   
   private static String randomMonsterName(){
      ArrayList<String> monsterNames = new ArrayList<String>();
      monsterNames.add("Gnarltooth");
      monsterNames.add("Sargath");
      monsterNames.add("Oscar");
      monsterNames.add("Thordak");
      monsterNames.add("Allen");
      monsterNames.add("Megan");
      monsterNames.add("Tom Capaul");
      
      int choice = (int)(Math.random() * monsterNames.size());
      return monsterNames.get(choice);
   }
}