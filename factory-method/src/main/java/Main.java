import creator.PersonCreator;
import creator.concrete.AmericanCreator;
import creator.concrete.BrazillianCreator;

public class Main {

	public static void main(String[] args) {

		PersonCreator brc = new BrazillianCreator();
		brc.createPerson().sayHello();

		PersonCreator arc = new AmericanCreator();
		arc.createPerson().sayHello();

	}

}
