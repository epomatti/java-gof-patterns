package mediator;

public class Consumer {
	
	private Mediator mediator;
	
	public Consumer(Mediator mediator) {
		this.mediator = mediator;
	}
	
	public void onMessage(Message message) {
		System.out.println("Message received: " + message.getMessage());
		mediator.acknowledge(true);
	}

}
