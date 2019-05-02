package singleton;



import org.junit.Assert;
import org.junit.Test;

import singleton.BolsaValores;

public class BolsaValoresTest {

	@Test
	public void test() {

		Float dolar = 2.3F;
		
		BolsaValores bolsa = BolsaValores.getInstance();
		bolsa.setDolar(dolar);
		
		BolsaValores bolsa2 = BolsaValores.getInstance();
		
		Assert.assertEquals(dolar, bolsa2.getDolar());
		
	}

}