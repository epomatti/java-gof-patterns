package strategy;


import org.junit.Assert;
import org.junit.Test;

import strategy.Contexto;
import strategy.Dividir;
import strategy.Multiplicar;
import strategy.Somar;
import strategy.Subtrair;

public class StrategyTest {

	@Test
	public void test() {

		// Valores
		int a = 100;
		int b = 10;

		// Resultados esperados
		int resultadoSoma = 110;
		int resultadoSubtracao = 90;
		int resultadoMultiplicacao = 1000;
		int resultadoDivisao = 10;
		
		Contexto contexto = new Contexto(new Somar());
		Assert.assertEquals(resultadoSoma, contexto.executeStrategy(a, b));
		
		contexto = new Contexto(new Subtrair());
		Assert.assertEquals(resultadoSubtracao, contexto.executeStrategy(a, b));
		
		contexto = new Contexto(new Multiplicar());
		Assert.assertEquals(resultadoMultiplicacao, contexto.executeStrategy(a, b));
		
		contexto = new Contexto(new Dividir());
		Assert.assertEquals(resultadoDivisao, contexto.executeStrategy(a, b));
	}

}
