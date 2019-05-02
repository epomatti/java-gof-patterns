package observer;

import java.util.Observable;

// Deprecated since Java 9
@SuppressWarnings("deprecation")
public class VersionObservable extends Observable {
	
	private String version = new String("1.0");

	public VersionObservable() {
		super();
	}

	public void updateVersion(String newVersion) {
		if(newVersion.equals(version)){
			return;
		} else {
			version = newVersion;
			setChanged();
			notifyObservers(version);
		}
		
	}

}
