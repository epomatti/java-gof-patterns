package decorator;

public class Main {

	public static void main(String[] args) {
		
		IceCream iceCream = new ToppingDecorator(new SimpleIceCream());
		
		System.out.println(iceCream.buildIceCream());
		
	}
	
}
