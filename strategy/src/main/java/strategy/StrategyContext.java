package strategy;

public class StrategyContext {

	private Strategy strategy;

	public StrategyContext(Strategy strategy) {
		super();
		this.strategy = strategy;
	}

	public int executeStrategy(int a, int b) {
		return strategy.execute(a, b);
	}

}
