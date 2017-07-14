package io.altar.parkee.repository;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.persistence.Query;
import javax.transaction.Transactional;

import io.altar.parkee.model.Customer;
import io.altar.parkee.model.Park;

@Named("customerRepository")
@ApplicationScoped
public class CustomerRepository extends EntityRepository<Customer> {
	
	public List<Customer> getDbElements() {
		
		Query query = getDb().createQuery("FROM customer");
		List<Customer> dbElements = (List<Customer>) query.getResultList();
		return dbElements;
	}
	
	@Override
	@Transactional
	public void removeFromDb(Customer customer){
		
		Customer customerToRemove = getDb().find(Customer.class, customer.getId());
		getDb().remove(customerToRemove);
	}
	
	@Transactional
	public void modifyDb(int id, String customerName, int customerContact, int nif){
		
		Customer dbCustomer = getDb().find(Customer.class, id);
		dbCustomer.setCustomerName(customerName);
		dbCustomer.setCustomerContact(customerContact);		
		dbCustomer.setNif(nif);
	}
	
	@Transactional
	public Customer addToDb(int id, String customerName, int customerContact, int nif){
		Customer newCustomer =  new Customer();
		newCustomer.setCustomerName(customerName);
		newCustomer.setCustomerContact(customerContact);	
		newCustomer.setNif(nif);
		getEm().persist(newCustomer);
		return newCustomer;
	}
}
