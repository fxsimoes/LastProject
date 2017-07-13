package io.altar.parkee.repository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import io.altar.parkee.model.Customer;

@Named("customerRepository")
@ApplicationScoped
public class CustomerRepository extends EntityRepository<Customer> {

	
}
