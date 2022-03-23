package prototype;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CarCloneTest {

	@Test
	public void test() throws CloneNotSupportedException {
		
		Car car = new Car();
		car.setName("Volvo");
		car.setColor("Red");
		
		Car carClone = (Car) car.clone();
		assertEquals(car.getName(), carClone.getName());
		assertEquals(car.getColor(), carClone.getColor());
	}

}
