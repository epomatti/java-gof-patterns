package mediator;

public interface Mediator {
	
	public void registerConsumer(Consumer consumer);
	public void registerProducer(Producer producer);
	public void send(Message message);
	public void acknowledge(Boolean ack);

}
