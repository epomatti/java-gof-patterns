package composite;

public class Main {

	public static void main(String[] args) {

		Toy b1 = new Toy();
		Toy b2 = new Toy();
		Toy b3 = new Toy();

		Box c1 = new Box();
		Box c2 = new Box();

		c2.add(b1);
		c2.add(b2);

		c1.add(c2);
		c1.add(b3);

	}

}
