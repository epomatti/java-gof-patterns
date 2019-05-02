package factory.concretes;

import drivers.concretes.SqlServerDriver;
import drivers.interfaces.Driver;
import factory.interfaces.DriverFactory;

public class SqlServerDriverFactory implements DriverFactory {

	@Override
	public Driver getDriver() {
		return new SqlServerDriver();
	}

}
