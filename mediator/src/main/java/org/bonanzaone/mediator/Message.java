package org.bonanzaone.mediator;

import lombok.Getter;
import lombok.Setter;

public class Message {
	
	@Getter @Setter
	public String message;

	public Message(String message) {
		super();
		this.message = message;
	}

}
