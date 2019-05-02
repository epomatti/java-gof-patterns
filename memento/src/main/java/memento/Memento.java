package memento;

import lombok.Getter;

public class Memento {
	
	@Getter
	private String state;

	public Memento(String state) {
		super();
		this.state = state;
	}

}
