package decorator;

public class CoberturaDecorator extends SorveteDecorator{

	public CoberturaDecorator(Sorvete sorvete) {
		super(sorvete);
	}
	
	@Override
	public String montarSorvete() {
		return super.montarSorvete() + " + " + adicionarCobertura();
	}
	
	private String adicionarCobertura() {
		return "Cobertura";
	}

}
