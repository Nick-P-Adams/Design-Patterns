import java.util.Observable;
import java.util.Observer;

public class badGuys implements Observer 
{
	String name, ggUpdate;
	theEye eye;
	
	public badGuys(final theEye eye, final String name)
	{
		this.name = name;
		this.eye = eye;
		
		this.eye.register(this);
	}

	@Override
	public void update(Observable o, Object arg) 
	{
		this.eye = (theEye) o;
		this.ggUpdate = (String) arg;
		
		this.toString();
	}
	
	public String toString()
	{
		String res = this.name + " is aware of " + this.ggUpdate + " THE EYE HATH SPOKEN!!\r\n";
		System.out.println(res);
		return res;
	}
	
	public void defeated()
	{
		this.eye.unregister(this);
		System.out.println(this.name + " has been defeated\r\n");
	}
}
