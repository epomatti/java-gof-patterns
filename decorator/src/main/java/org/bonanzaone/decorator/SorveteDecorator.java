package org.bonanzaone.decorator;

public class SorveteDecorator implements Sorvete{
	
	private Sorvete sorvete;
	
	public SorveteDecorator(Sorvete sorvete){
		this.sorvete = sorvete;
	}

	@Override
	public String montarSorvete() {
		return sorvete.montarSorvete();
	}

}
