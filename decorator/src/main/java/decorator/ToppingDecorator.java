package decorator;

public class ToppingDecorator extends IceCreamDecorator{

	public ToppingDecorator(IceCream iceCream) {
		super(iceCream);
	}
	
	@Override
	public String buildIceCream() {
		return super.buildIceCream() + " + " + addTopping();
	}
	
	private String addTopping() {
		return "Topping";
	}

}
