package facade;

public class AddressService {
	
	public Address newAddress(String address) {
		Address newAddress = new Address();
		newAddress.setAddress(address);
		return newAddress;
	}

}
