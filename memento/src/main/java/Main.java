import memento.Caretaker;
import memento.Memento;
import memento.Originator;

public class Main {

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
