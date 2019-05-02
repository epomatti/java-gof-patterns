package factory;

import factory.concretes.OracleDriverFactory;
import factory.concretes.SqlServerDriverFactory;
import factory.interfaces.DriverFactory;

public class DriverManager {

	public static DriverFactory getFactory(String factory) {
		if (factory.equalsIgnoreCase("SqlServer")) {
			return new SqlServerDriverFactory();
		} else if (factory.equalsIgnoreCase("OracleServer")) {
			return new OracleDriverFactory();
		} else {
			return null;
		}

	}

}
