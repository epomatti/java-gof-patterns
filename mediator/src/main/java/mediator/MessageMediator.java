package mediator;

import lombok.Getter;
import lombok.Setter;

public @Getter @Setter class MessageMediator implements Mediator {	
	
	private Consumidor consumidor;
	private Produtor produtor;

	@Override
	public void registrarConsumidor(Consumidor consumidor) {
		this.consumidor = consumidor;		
	}

	@Override
	public void registrarProdutor(Produtor produtor) {
		this.produtor = produtor;
	}

	@Override
	public void send(Message message) {		
		consumidor.onMessage(message);		
	}

	@Override
	public void acknowledge(Boolean ack) {
		produtor.acknowledge(ack);
	}

}
