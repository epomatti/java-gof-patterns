package strategy;

public class Somar implements Strategy{

	@Override
	public int executar(int a, int b) {
		return a+ b;
	}

}
