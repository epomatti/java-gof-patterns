package singleton;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StockTest {

	@Test
	public void test() {

		Float dollar = 2.3F;

		Stock stock = Stock.getInstance();
		stock.setDollar(dollar);

		Stock stock2 = Stock.getInstance();

		assertEquals(dollar, stock2.getDollar());

	}

}
