package io.altar.parkee.view;

import java.io.Serializable;
import java.util.Collection;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import io.altar.parkee.model.Customer;
import io.altar.parkee.service.CustomerService;

@Named("CustomerBean")
@RequestScoped
public class CustomerBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Customer newCustomer = new Customer();
	private Customer activeCustomer = new Customer();


	public Customer getNewCustomer() {
		return newCustomer;
	}

	public void setNewCustomer(Customer newCustomer) {
		this.newCustomer = newCustomer;
	}

	public Customer getActiveCustomer() {
		return activeCustomer;
	}

	public void setActiveCustomer(Customer activeCustomer) {
		this.activeCustomer = activeCustomer;
	}

	@Inject
	private CustomerService customerService;
	
	public Collection<Customer> getCustomers() {
		
		return customerService.showCustomers(customerService.getCustomerRepository());
	}
	
	public CustomerService getCustomerService() {
		return customerService;
	}

	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}
	
	public void addCustomer() {
		customerService.addEntity(newCustomer);
	}
	
	public void deleteCustomer() {
		
		customerService.deleteCustomer(id);
	}
}
