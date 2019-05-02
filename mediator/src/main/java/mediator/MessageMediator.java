package mediator;

import lombok.Getter;
import lombok.Setter;

public @Getter @Setter class MessageMediator implements Mediator {	
	
	private Consumer consumer;
	private Producer producer;

	@Override
	public void registerConsumer(Consumer consumer) {
		this.consumer = consumer;		
	}

	@Override
	public void registerProducer(Producer producer) {
		this.producer = producer;
	}

	@Override
	public void send(Message message) {		
		consumer.onMessage(message);		
	}

	@Override
	public void acknowledge(Boolean ack) {
		producer.acknowledge(ack);
	}

}
