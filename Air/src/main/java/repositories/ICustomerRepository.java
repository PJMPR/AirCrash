package repositories;

import java.util.List;

import AirCrash.Air.Customer;

public interface ICustomerRepository extends IRepository<Customer>{
	
	public List<Customer> withName(String name);
	public List<Customer> withSurname(String surname);

}
