package tz.go.bot.service;

import java.util.List;

import tz.go.bot.model.Customer;
import tz.go.bot.repository.CustomerRepository;
import tz.go.bot.repository.CustomerRepositoryListImpl;

public class CustomerServiceListImpl implements CustomerService {
	
	CustomerRepository customerRepository=new CustomerRepositoryListImpl();
	
	public void addCustomer(Customer c) {
		
		//Validation 
		if(c.getAccountType().equalsIgnoreCase("Savings")||c.getAccountType().equalsIgnoreCase("Current")) {
			
			customerRepository.addCustomer(c);
		}
		else {
			System.out.println("Wrong Account Type Added");
		}
		
	}
	
	public List<Customer> getAllCustomers(){
		return customerRepository.getAllCustomers();
	}
	
	public Customer getCustomerById(int id) {
		return null;
	}
	
	public void deleteCustomer(int id) {
		
	}

}
