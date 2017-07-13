package io.altar.parkee.service;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import io.altar.parkee.model.Customer;
import io.altar.parkee.repository.CustomerRepository;

@Named("CustomerService")
@RequestScoped
public class CustomerService extends EntityService<Customer> {

	@Inject 
	private CustomerRepository customerRepository;

	public CustomerRepository getCustomerRepository() {
		return customerRepository;
	}
}
