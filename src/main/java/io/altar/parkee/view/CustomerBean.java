package io.altar.parkee.view;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import io.altar.parkee.model.Customer;
import io.altar.parkee.service.CustomerService;

@Named("CustomerBean")
@RequestScoped
public class CustomerBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Customer selectedCustomer = new Customer();
	
	@Inject
	private CustomerService customerService;
}
