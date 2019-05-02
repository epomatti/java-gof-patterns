package facade;

public class CustomerService {
	
	public Customer newCustomer(String name) {
		Customer customer = new Customer();
		customer.setName(name);
		return customer;
	}

}
