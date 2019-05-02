package org.bonanzaone.observer;

import java.util.Observable;
import java.util.Observer;

//Deprecated since Java 9
@SuppressWarnings("deprecation")
public class SistemaObserver implements Observer{

	@Override
	public void update(Observable o, Object arg) {

		System.out.println("Versão atualizada para: " + arg);
		
	}

}
