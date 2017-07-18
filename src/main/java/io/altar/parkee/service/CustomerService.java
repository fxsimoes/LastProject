package io.altar.parkee.service;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import io.altar.parkee.model.Customer;
import io.altar.parkee.repository.CustomerRepository;

@Named("CustomerService")
@RequestScoped
public class CustomerService extends EntityService<Customer> {

	@Inject 
	private CustomerRepository customerList;

	public CustomerRepository getCustomerRepository() {
		return customerList;
	}
	
	public List<Customer> showCustomers(CustomerRepository customerRepository){
		
		List<Customer> list = customerList.getDbElements();
		return list;
	}
	
//	public Customer addEntity(int id, String customerName, int customerContact, int nif){
//
//		Customer newCustomer = customerList.addToDb(id, customerName, customerContact, nif);
//		return newCustomer;
//	}
	
	@Transactional
	public Customer addEntity(Customer newCustomer){
		customerList.addToDb(newCustomer);
		return newCustomer;
	}
	
	public void modifyEntity(int id, String customerName, int customerContact, int nif) {
		
		customerList.modifyDb(id, customerName, customerContact, nif);
	}
}
