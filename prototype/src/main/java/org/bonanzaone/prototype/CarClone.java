package org.bonanzaone.prototype;

public class CarClone {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Car car = new Car();
		car.setName("Volvo");
		car.setCor("Vermelho");
		
		Car carClone = (Car) car.clone();
		System.out.println(carClone.getName());
		System.out.println(carClone.getCor());
		
	}

}
