package creator.concrete;

import creator.PersonCreator;
import product.Person;
import product.concrete.American;

public class AmericanCreator implements PersonCreator{

	@Override
	public Person createPerson() {
		return new American();		
	}

}
