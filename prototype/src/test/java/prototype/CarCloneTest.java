package prototype;


import org.junit.Assert;
import org.junit.Test;

import prototype.Car;

public class CarCloneTest {

	@Test
	public void test() throws CloneNotSupportedException {
		
		Car car = new Car();
		car.setName("Volvo");
		car.setColor("Red");
		
		Car carClone = (Car) car.clone();
		Assert.assertEquals(car.getName(), carClone.getName());
		Assert.assertEquals(car.getColor(), carClone.getColor());
	}

}
