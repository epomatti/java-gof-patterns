package org.bonanzaone.template_method;

public class ConcreteClass extends Template {

	@Override
	protected void parte3() {
		System.out.println("parte 3 executada");
	}

	@Override
	protected void parte2() {
		System.out.println("parte 2 executada");
	}

	@Override
	protected void parte1() {
		System.out.println("parte 1 executada");
	}

}
