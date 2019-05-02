package org.bonanzaone.creator.concrete;

import org.bonanzaone.creator.PersonCreator;
import org.bonanzaone.product.Person;
import org.bonanzaone.product.concrete.American;

public class AmericanCreator implements PersonCreator{

	@Override
	public Person createPerson() {
		return new American();		
	}

}
