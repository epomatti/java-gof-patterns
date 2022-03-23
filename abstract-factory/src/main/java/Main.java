

import drivers.interfaces.Driver;
import factory.DriverManager;
import factory.interfaces.DriverFactory;

public class Main {

  public static void main(String[] args) {

    DriverFactory sqlFactory = DriverManager.getFactory("SqlServer");
    Driver sqlDriver = sqlFactory.getDriver();
    System.out.println(sqlDriver.getDriverName());

    DriverFactory oracleFactory = DriverManager.getFactory("OracleServer");
    Driver oracleDriver = oracleFactory.getDriver();
    System.out.println(oracleDriver.getDriverName());

  }

}
