package mediator;

public class Client {
	
	public static void main(String[] args) {
		
		Mediator mediator = new MessageMediator();
		Produtor produtor = new Produtor(mediator);
		Consumidor consumidor = new Consumidor(mediator);
		
		mediator.registrarConsumidor(consumidor);
		mediator.registrarProdutor(produtor);
		
		produtor.enviarMensagemTexto("TESTE!");		
		
	}

}
