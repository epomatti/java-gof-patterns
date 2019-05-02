package factory.concretes;

import drivers.concretes.OracleDriver;
import drivers.interfaces.Driver;
import factory.interfaces.DriverFactory;

public class OracleDriverFactory implements DriverFactory {

	@Override
	public Driver getDriver() {
		return new OracleDriver();
	}

}
