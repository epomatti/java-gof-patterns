package org.bonanzaone.composite;

public class Main {

	public static void main(String[] args) {

		Brinquedo b1 = new Brinquedo();
		Brinquedo b2 = new Brinquedo();
		Brinquedo b3 = new Brinquedo();
		
		Caixa c1 = new Caixa();
		Caixa c2 = new Caixa();
		
		c2.add(b1);
		c2.add(b2);
		
		c1.add(c2);
		c1.add(b3);
		
		
		
	}

}
