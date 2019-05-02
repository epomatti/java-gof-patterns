package strategy;


import org.junit.Assert;
import org.junit.Test;

import strategy.StrategyContext;
import strategy.Divide;
import strategy.Multiply;
import strategy.Add;
import strategy.Subtract;

public class StrategyTest {

	@Test
	public void test() {

		// Valores
		int a = 100;
		int b = 10;

		// Resultados esperados
		int addResult = 110;
		int subResult = 90;
		int multResult = 1000;
		int divResult = 10;
		
		StrategyContext context = new StrategyContext(new Add());
		Assert.assertEquals(addResult, context.executeStrategy(a, b));
		
		context = new StrategyContext(new Subtract());
		Assert.assertEquals(subResult, context.executeStrategy(a, b));
		
		context = new StrategyContext(new Multiply());
		Assert.assertEquals(multResult, context.executeStrategy(a, b));
		
		context = new StrategyContext(new Divide());
		Assert.assertEquals(divResult, context.executeStrategy(a, b));
	}

}
