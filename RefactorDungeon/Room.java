import java.util.*;
import java.awt.Point;

public class Room 
{
	Random ran = new Random();
	boolean healingPotion = false;
	boolean pit = false;
	boolean entrance = false;
	boolean exit = false;
	boolean pillarOfOO = false;
	boolean monster = false;
	boolean visionPotion = false;
	char roomSymbol = 'E';
	int items = 0;
	boolean northDoor = false;
	boolean southDoor = false;
	boolean eastDoor = false;
	boolean westDoor = false;
	
	public Room(boolean entrance, boolean exit, boolean pillarOfOO, Point location) 
	{
		if(entrance) 
		{
			this.entrance = entrance;
			this.roomSymbol = 'I';
		}
		else if(exit)
		{
			this.exit = exit;
			this.roomSymbol = 'O';
		}
		else if(pillarOfOO)
		{
			this.pillarOfOO = pillarOfOO;
			this.roomSymbol = '!';
		}
		else
		{
			this.healingPotion = roll();
			this.pit = roll();
			this.monster = roll();
			this.visionPotion = roll();
		}	
		if(items > 0)
		{
			if(items > 1)
				this.roomSymbol = 'M';
			else if(this.healingPotion)
				this.roomSymbol = 'H';
			else if(this.pit)
				this.roomSymbol = 'P';
			else if(this.monster)
				this.roomSymbol = 'X';
			else
				this.roomSymbol = 'V';
		}
		
		if(location.getX() > 0) 
			this.westDoor = true;
		if(location.getX() < 4) 
			this.eastDoor = true;
	    if(location.getY() > 0) 
	    	this.northDoor = true;
	    if(location.getY() < 4) 
	    	this.southDoor = true;
	    
	}
	
	private boolean roll() 
	{
		int roll = ran.nextInt(100);
		if(roll < 10)
		{
			this.items = items + 1;
			return true;
		}
		return false;
	}
	
	public String toString() 
	{
		char n = '*';
		char s = '*';
		char e = '*';
		char w = '*';
		if(this.northDoor)
			n = '-';
		if(this.southDoor)
			s = '-';
		if(this.eastDoor)
			e = '|';
		if(this.westDoor)
			w = '|';
		return "*" + n + "*\n" + w + this.roomSymbol + e + "\n*" + s + "*\n";
	}
	
	public boolean getEntrance(){return this.entrance;}
	public boolean getExit(){return this.exit;}
}
