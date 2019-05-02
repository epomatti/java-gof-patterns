package facade;

import org.junit.Assert;
import org.junit.Test;

import facade.Address;
import facade.Customer;
import facade.CustomerFacade;

public class CustomerFacadeTest {

	@Test
	public void testNewCustomer() {

		String customerName = "Evandro";
		String addressName = "My address";
		
		CustomerFacade facade = new CustomerFacade();
		Customer customer = facade.newCustomer(customerName, addressName);
		
		Assert.assertNotNull(customer);
		
		Assert.assertEquals(customerName, customer.getName());
		
		Address address = customer.getAddress();
		Assert.assertNotNull(address);
		
		Assert.assertEquals(addressName, address.getAddress());
		
	}

}
