package org.bonanzaone.observer;

import java.util.Observable;

// Deprecated since Java 9
@SuppressWarnings("deprecation")
public class VersaoObservable extends Observable {
	
	private String versao = new String("1.0");

	public VersaoObservable() {
		super();
	}

	public void atualizarVersao(String novaVersao) {
		if(novaVersao.equals(versao)){
			return;
		} else {
			versao = novaVersao;
			setChanged();
			notifyObservers(versao);
		}
		
	}

}
