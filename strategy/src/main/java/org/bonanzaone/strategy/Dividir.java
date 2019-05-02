
package org.bonanzaone.strategy;

public class Dividir implements Strategy {

	@Override
	public int executar(int a, int b) {
		return a / b;
	}

}
