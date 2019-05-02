package proxy.transaction;

public class ClienteCommand implements Command {

	@Override
	public void execute() {
		System.out.println("Client command executed!");
	}

}
