package org.bonanzaone.product.concrete;

import org.junit.Assert;
import org.junit.Test;

import product.concrete.Brazillian;

public class BrazillianTest {

	@Test
	public void testSayHello() {
		String hello = "Olá";
		Brazillian brazillian = new Brazillian();
		Assert.assertEquals(hello, brazillian.sayHello());
	}

}
