package org.bonanzaone.proxy.transacao;

public class ClienteCommand implements Command {

	@Override
	public void execute() {
		System.out.println("Comando de cliente executado!");
	}

}
