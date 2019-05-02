package mediator;

public interface Mediator {
	
	public void registrarConsumidor(Consumidor consumidor);
	public void registrarProdutor(Produtor produtor);
	public void send(Message message);
	public void acknowledge(Boolean ack);

}
