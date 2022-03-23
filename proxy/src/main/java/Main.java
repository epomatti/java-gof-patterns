import proxy.reflection.ProxyExample;
import proxy.transaction.TransactionExample;

public class Main {

  public static void main(String[] args) {

    new ProxyExample().proxy();

    new TransactionExample().transaction();

  }

}
