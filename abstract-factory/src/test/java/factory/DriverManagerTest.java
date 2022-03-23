package factory;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import drivers.interfaces.Driver;
import factory.interfaces.DriverFactory;

public class DriverManagerTest {

	public static Stream<String> factories() {
		return Stream.of("SqlServer", "OracleServer");
	}

	public static Stream<String> drivers() {
		return Stream.of("SqlServer", "Oracle");
	}

	@ParameterizedTest
	@MethodSource({ "factories", "drivers" })
	public void testGetFactory(String factory, String driver) {

		DriverFactory df = DriverManager.getFactory(factory);

		assertNotNull(df);

		Driver d = df.getDriver();

		// Adding for coverage
		d.commit();
		d.execute("");
		d.rollback();

		assertNotNull(d);
		assertEquals(driver, d.getDriverName());
	}

	@Test
	public void testInvalidGetFactory() {
		new DriverManager();
		DriverFactory df = DriverManager.getFactory("");
		assertNull(df);

	}
}
