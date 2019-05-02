package org.bonanzaone.strategy;

public class Multiplicar implements Strategy {

	@Override
	public int executar(int a, int b) {
		return a * b;
	}

}
