package observer;

import java.util.Observer;

//Deprecated since Java 9
@SuppressWarnings("deprecation")
public class ClienteObserver {
	
	public static void main(String[] args) {
		
		Observer sistema1 = new SistemaObserver();
		Observer sistema2 = new SistemaObserver();
		
		VersaoObservable versao = new VersaoObservable();
		
		versao.addObserver(sistema1);
		versao.addObserver(sistema2);
		
		versao.atualizarVersao("1.1");
		
	}

}

