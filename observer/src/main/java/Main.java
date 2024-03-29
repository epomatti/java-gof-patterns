import java.util.Observer;

import observer.SystemObserver;
import observer.VersionObservable;

//Deprecated since Java 9
@SuppressWarnings("deprecation")
public class Main {
	
	public static void main(String[] args) {
		
		Observer system1 = new SystemObserver();
		Observer system2 = new SystemObserver();
		
		VersionObservable version = new VersionObservable();
		
		version.addObserver(system1);
		version.addObserver(system2);
		
		version.updateVersion("1.1");
		
	}

}

