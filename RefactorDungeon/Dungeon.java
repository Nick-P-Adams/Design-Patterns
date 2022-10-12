import java.awt.Point;

public class Dungeon 
{
	Room[][] dungeon = new Room[5][5];
	boolean entrance = false;
	boolean exit = false;
	int numPillars = 0;
	Point location, exitLocation, entranceLocation;
	
	public Dungeon()
	{
		for(int i=0; i < dungeon.length; i++)
		{
			for(int j=0; j < dungeon.length; j++)
			{
				location = new Point(i,j);
				dungeon[i][j] = new Room(false, false, false, location);
			}
		}
		this.setEntrance();
		this.setExit();
		this.placePillars();
	}
	
	public void setEntrance()
	{
		if(this.entrance == false)
		{
			int entranceIndex = (int) (Math.random() * 5);
			for(int i=0; i < this.dungeon.length; i++)
			{
				for(int j=0; j < this.dungeon.length; j++)
				{
					this.location = new Point(i,j);
					this.entranceLocation = location;
					if(i == 0 && j == entranceIndex)
					{
						this.dungeon[i][j] = new Room(true, false, false, this.location);
					}
				}
			}
			this.entrance = true;
		}
	}
	
	public void setExit()
	{
		if(this.exit == false)
		{
			int exitIndex = (int) (Math.random() * 5);
			for(int i=0; i < this.dungeon.length; i++)
			{
				for(int j=0; j < this.dungeon.length; j++)
				{
					this.location = new Point(i,j);
					this.exitLocation = location;
					if(i == 4 && j == exitIndex)
					{
						this.dungeon[i][j] = new Room(false, true, false, this.location);
					}
				}
			}
			this.exit = true;
		}
	}
	
	public void placePillars()
	{
		while(this.numPillars < 4)
		{
			int x = (int) (Math.random() * 5);
			int y = (int) (Math.random() * 5);
			
			for(int i=0; i < this.dungeon.length; i++)
			{
				for(int j=0; j < this.dungeon.length; j++)
				{
					this.location = new Point(i,j);
					if(i == x && j == y && this.dungeon[i][j].getEntrance() == false && this.dungeon[i][j].getExit() == false)
					{
						this.dungeon[i][j] = new Room(false, false, true, location);
					}
				}
			}
			this.numPillars++;
		}
	}
	
	public void print()
	{
		System.out.println(this.dungeon[0][0].toString() + this.dungeon[0][1].toString() + this.dungeon[0][2].toString() + this.dungeon[0][3].toString() + this.dungeon[0][4].toString());
		System.out.println(this.dungeon[1][0].toString() + this.dungeon[1][1].toString() + this.dungeon[1][2].toString() + this.dungeon[1][3].toString() + this.dungeon[1][4].toString());
		System.out.println(this.dungeon[2][0].toString() + this.dungeon[2][1].toString() + this.dungeon[2][2].toString() + this.dungeon[2][3].toString() + this.dungeon[2][4].toString());
		System.out.println(this.dungeon[3][0].toString() + this.dungeon[3][1].toString() + this.dungeon[3][2].toString() + this.dungeon[3][3].toString() + this.dungeon[3][4].toString());
		System.out.println(this.dungeon[4][0].toString() + this.dungeon[4][1].toString() + this.dungeon[4][2].toString() + this.dungeon[4][3].toString() + this.dungeon[4][4].toString());
	}
	
	public Room getRoom(Point location)
	{
		int x = (int) location.getX();
		int y = (int) location.getY();
		
		return dungeon[x][y];
	}
	
	public Point getExitLocation() {return this.exitLocation;}
	public Point getEntranceLocation() {return this.entranceLocation;}

}
