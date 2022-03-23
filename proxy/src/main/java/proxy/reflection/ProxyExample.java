package proxy.reflection;

import java.lang.reflect.Proxy;

public class ProxyExample {

	public void proxy() {

		// Proxy Example
		Animal realSubject = new Lion();
		Animal proxy = (Animal) Proxy.newProxyInstance(realSubject.getClass()
				.getClassLoader(), realSubject.getClass().getInterfaces(),
				new AnimalInvocationHandler(realSubject));
		proxy.getSound();

	}
}