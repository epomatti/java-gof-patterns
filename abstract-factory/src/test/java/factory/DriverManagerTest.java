package factory;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import drivers.interfaces.Driver;
import factory.interfaces.DriverFactory;

@RunWith(Parameterized.class)
public class DriverManagerTest {

	private String factory;
	private String driver;

	public DriverManagerTest(String factory, String driver) {
		super();
		this.factory = factory;
		this.driver = driver;
	}

	@SuppressWarnings("rawtypes")
	@Parameters
	public static Collection primeNumbers() {
		return Arrays.asList(new Object[][] { { "SqlServer", "SqlServer" }, { "OracleServer", "Oracle" } });
	}

	@Test
	public void testGetFactory() {

		DriverFactory df = DriverManager.getFactory(factory);

		Assert.assertNotNull(df);

		Driver d = df.getDriver();

		// Adding for coverage
		d.commit();
		d.execute("");
		d.rollback();

		Assert.assertNotNull(d);
		Assert.assertEquals(driver, d.getDriverName());
	}

	@Test
	public void testInvalidGetFactory() {
		new DriverManager();
		DriverFactory df = DriverManager.getFactory("");
		Assert.assertNull(df);

	}
}
