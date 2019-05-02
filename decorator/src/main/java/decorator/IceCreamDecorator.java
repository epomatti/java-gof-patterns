package decorator;

public class IceCreamDecorator implements IceCream {

	private IceCream iceCream;

	public IceCreamDecorator(IceCream iceCream) {
		this.iceCream = iceCream;
	}

	@Override
	public String buildIceCream() {
		return iceCream.buildIceCream();
	}

}
