package memento;

import lombok.Getter;
import lombok.Setter;

public class Originator {
	
	@Getter @Setter
	private String state;
	
	public Memento createMemento() {
		return new Memento(state);
	}
	
	public void recoverMemento(Memento memento) {
		
	}

}
