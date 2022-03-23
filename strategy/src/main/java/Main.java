import strategy.Add;
import strategy.StrategyContext;

public class Main {

	public static void main(String[] args) {

		StrategyContext context;
		context = new StrategyContext(new Add());
		int result = context.executeStrategy(5, 4);

		System.out.println(result);
	}

}
