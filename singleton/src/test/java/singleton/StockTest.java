package singleton;



import org.junit.Assert;
import org.junit.Test;

import singleton.Stock;

public class StockTest {

	@Test
	public void test() {

		Float dollar = 2.3F;
		
		Stock stock = Stock.getInstance();
		stock.setDollar(dollar);
		
		Stock stock2 = Stock.getInstance();
		
		Assert.assertEquals(dollar, stock2.getDollar());
		
	}

}
