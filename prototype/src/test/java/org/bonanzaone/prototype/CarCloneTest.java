package org.bonanzaone.prototype;


import org.junit.Assert;
import org.junit.Test;

public class CarCloneTest {

	@Test
	public void test() throws CloneNotSupportedException {
		
		Car car = new Car();
		car.setName("Volvo");
		car.setCor("Vermelho");
		
		Car carClone = (Car) car.clone();
		Assert.assertEquals(car.getName(), carClone.getName());
		Assert.assertEquals(car.getCor(), carClone.getCor());
	}

}
