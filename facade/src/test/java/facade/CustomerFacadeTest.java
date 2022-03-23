package facade;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class CustomerFacadeTest {

	@Test
	public void testNewCustomer() {

		String customerName = "Evandro";
		String addressName = "My address";

		CustomerFacade facade = new CustomerFacade();
		Customer customer = facade.newCustomer(customerName, addressName);

		assertNotNull(customer);

		assertEquals(customerName, customer.getName());

		Address address = customer.getAddress();
		assertNotNull(address);

		assertEquals(addressName, address.getAddress());

	}

}
