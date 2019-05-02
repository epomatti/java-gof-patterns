package prototype;

public class CarClone {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Car car = new Car();
		car.setName("Volvo");
		car.setColor("Red");
		
		Car carClone = (Car) car.clone();
		System.out.println(carClone.getName());
		System.out.println(carClone.getColor());
		
	}

}
