package strategy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

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
		assertEquals(addResult, context.executeStrategy(a, b));

		context = new StrategyContext(new Subtract());
		assertEquals(subResult, context.executeStrategy(a, b));

		context = new StrategyContext(new Multiply());
		assertEquals(multResult, context.executeStrategy(a, b));

		context = new StrategyContext(new Divide());
		assertEquals(divResult, context.executeStrategy(a, b));
	}

}
