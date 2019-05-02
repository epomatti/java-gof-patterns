package org.bonanzaone.memento;

public class MementoClient {

	public static void main(String[] args) {
		Originator originator = new Originator();
		originator.setState("Lion");
		
		Memento memento = originator.createMemento();
		
		Caretaker caretaker = new Caretaker();
		caretaker.addMemento(memento);
		
		originator.setState("Elephant");
		
		
		originator.setState("Chicken");
		
		
		
	}
}
