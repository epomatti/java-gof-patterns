package strategy;

public class Contexto {

	private Strategy strategy;

	public Contexto(Strategy strategy) {
		super();
		this.strategy = strategy;
	}

	public int executeStrategy(int a, int b) {
		return strategy.executar(a, b);
	}

}
