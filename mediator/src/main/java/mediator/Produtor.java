package mediator;

public class Produtor {
	
	private Mediator mediator;
	private Boolean ack = false;
	
	public Produtor(Mediator mediator) {
		this.mediator = mediator;
	}
	
	public void enviarMensagemTexto(String texto) {
		Message message = new Message(texto);
		mediator.send(message);
		String resultado = null;
		if(ack) {
			resultado = "Operação concluída com sucesso!!!";
		} else {
			resultado = "ACK não recebido! A operação falhou.";
		}
		System.out.println(resultado);
	}
	
	public void acknowledge(Boolean ack) {
		this.ack = ack;
		System.out.println("ACK recebido: " + ack);
	}

}
