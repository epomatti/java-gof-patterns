package observer;

import java.util.Observable;
import java.util.Observer;

//Deprecated since Java 9
@SuppressWarnings("deprecation")
public class SystemObserver implements Observer{

	@Override
	public void update(Observable o, Object arg) {

		System.out.println("Version updated to: " + arg);
		
	}

}
