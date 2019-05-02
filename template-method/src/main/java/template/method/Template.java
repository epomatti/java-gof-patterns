package template.method;

public abstract class Template {
	
	private boolean variavel;
	
	public void executar() {
		parte1();
		parte2();
		if(variavel) {
			parte3();
		}
	}

	protected abstract void parte3();

	protected abstract void parte2();

	protected abstract void parte1();

}
