package decorator;

public class Main {

	public static void main(String[] args) {
		
		Sorvete sorvete = new CoberturaDecorator(new SorveteSimples());
		
		System.out.println(sorvete.montarSorvete());
		
	}
	
}
