package org.bonanzaone.product.concrete;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import product.concrete.Brazillian;

public class BrazillianTest {

	@Test
	public void testSayHello() {
		String hello = "Olá";
		Brazillian brazillian = new Brazillian();
		assertEquals(hello, brazillian.sayHello());
	}

}
