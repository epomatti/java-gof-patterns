package strategy;

public class ClientStrategy {
	
	public static void main(String[] args) {
		
		Contexto contexto;
		contexto = new Contexto(new Somar());
		int resultado = contexto.executeStrategy(5, 4);
		
		System.out.println(resultado);
	}

}
