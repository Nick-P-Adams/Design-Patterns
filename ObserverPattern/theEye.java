import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class theEye extends Observable
{
	private ArrayList<Observer> observers;
	private goodGuys gg;
	
	public theEye()
	{
		observers = new ArrayList<Observer>();
	}
	
	public void register(Observer newObserver)
	{
		observers.add(newObserver);
	}
	
	public void unregister(Observer Observer)
	{
		int observerIndex = observers.indexOf(Observer);
		observers.remove(observerIndex);
	}
	
	public void notifyObservers()
	{
		for(Observer observer : observers)
		{
			observer.update(this, gg.toString());
		}
	}
	
	public void setGoodGuys(final int hobbits, final int elves, final int dwarves, final int men)
	{
		this.gg = new goodGuys(hobbits, elves, dwarves, men);
		this.notifyObservers();
	}
}
