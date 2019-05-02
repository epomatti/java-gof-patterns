package org.bonanzaone.singleton;

import lombok.Getter;
import lombok.Setter;

public class BolsaValores {
	
	private static BolsaValores SINGLETON = new BolsaValores();

	@Getter @Setter
	private Float dolar;

	protected BolsaValores() {}
	
	public static BolsaValores getInstance(){
		return SINGLETON;
	}

}
