package proxy.transaction;

import java.lang.reflect.Proxy;

public class TransactionExample {

	public void transaction() {

		Command command = new ClienteCommand();
		Command proxyCommand = (Command) Proxy.newProxyInstance(command.getClass().getClassLoader(),
				command.getClass().getInterfaces(), new TransactionalCommand(command));
		proxyCommand.execute();

	}

}
