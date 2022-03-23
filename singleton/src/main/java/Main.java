import singleton.Stock;
import singleton.StockLazy;

public class Main {

  public static void main(String[] args) {

    Stock.getInstance().setDollar(5.0f);

    StockLazy.getInstance().setReal(1.0f);

  }

}
