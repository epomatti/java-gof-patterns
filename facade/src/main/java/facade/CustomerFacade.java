package facade;

public class CustomerFacade {
	
	public Customer newCustomer(String name, String address) {
		
		// Calls the customer system
		CustomerService customerService = new CustomerService();
		Customer customer = customerService.newCustomer(name);
		
		// Calls the address system
		AddressService addressService = new AddressService();
		Address newAddress = addressService.newAddress(address);
		
		customer.setAddress(newAddress);
		
		/*
		 * Do anything
		 */
		
		return customer;
	}

}
