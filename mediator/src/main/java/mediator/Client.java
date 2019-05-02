package mediator;

public class Client {
	
	public static void main(String[] args) {
		
		Mediator mediator = new MessageMediator();
		Producer producer = new Producer(mediator);
		Consumer consumer = new Consumer(mediator);
		
		mediator.registerConsumer(consumer);
		mediator.registerProducer(producer);
		
		producer.sendTextMessage("TEST!");		
		
	}

}
