package mediator;

public class Producer {
	
	private Mediator mediator;
	private Boolean ack = false;
	
	public Producer(Mediator mediator) {
		this.mediator = mediator;
	}
	
	public void sendTextMessage(String text) {
		Message message = new Message(text);
		mediator.send(message);
		String result = null;
		if(ack) {
			result = "Operation successful!!!";
		} else {
			result = "ACK not received. Operation failed!";
		}
		System.out.println(result);
	}
	
	public void acknowledge(Boolean ack) {
		this.ack = ack;
		System.out.println("ACK received: " + ack);
	}

}
