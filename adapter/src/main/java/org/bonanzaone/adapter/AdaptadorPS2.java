package org.bonanzaone.adapter;

public class AdaptadorPS2 {

	private MouseUSB mouseUSB;
	
	public AdaptadorPS2(MouseUSB mouseUSB) {
		this.mouseUSB = mouseUSB;
	}
	
	public void comando(String comando) {
		ComandoUSB comandoUSB = new ComandoUSB();
		comandoUSB.setComando(comando + " USB");
		mouseUSB.movimenta(comandoUSB);
	}
	
}
