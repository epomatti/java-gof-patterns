package proxy.transaction;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TransactionalCommand implements InvocationHandler{
	
	private Command command;
	
	public TransactionalCommand(Command command) {
		this.command = command;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("Conexão aberta.");		
		Object result = method.invoke(command, args);		
		System.out.println("Commitado!!!");
		return result;
	}

}
