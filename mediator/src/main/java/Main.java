import mediator.Consumer;
import mediator.Mediator;
import mediator.MessageMediator;
import mediator.Producer;

public class Main {
	
	public static void main(String[] args) {
		
		Mediator mediator = new MessageMediator();
		Producer producer = new Producer(mediator);
		Consumer consumer = new Consumer(mediator);
		
		mediator.registerConsumer(consumer);
		mediator.registerProducer(producer);
		
		producer.sendTextMessage("TEST!");		
		
	}

}
