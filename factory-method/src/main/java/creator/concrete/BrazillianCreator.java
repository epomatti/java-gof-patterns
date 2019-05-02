package creator.concrete;

import creator.PersonCreator;
import product.Person;
import product.concrete.Brazillian;

public class BrazillianCreator implements PersonCreator{

	@Override
	public Person createPerson() {
		return new Brazillian();
	}
	
}
