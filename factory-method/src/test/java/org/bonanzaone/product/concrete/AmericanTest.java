package org.bonanzaone.product.concrete;

import org.junit.Assert;
import org.junit.Test;

import product.concrete.American;

public class AmericanTest {

	@Test
	public void testSayHello() {
		String hello = "Hello";
		American american = new American();
		Assert.assertEquals(hello, american.sayHello());
	}

}
