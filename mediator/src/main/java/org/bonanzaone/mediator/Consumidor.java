package org.bonanzaone.mediator;

public class Consumidor {
	
	private Mediator mediator;
	
	public Consumidor(Mediator mediator) {
		this.mediator = mediator;
	}
	
	public void onMessage(Message message) {
		System.out.println("Mensagem recebida: " + message.getMessage());
		mediator.acknowledge(true);
	}

}
