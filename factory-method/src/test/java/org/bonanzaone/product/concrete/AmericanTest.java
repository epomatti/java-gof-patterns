package org.bonanzaone.product.concrete;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import product.concrete.American;

public class AmericanTest {

	@Test
	public void testSayHello() {
		String hello = "Hello";
		American american = new American();
		assertEquals(hello, american.sayHello());
	}

}
