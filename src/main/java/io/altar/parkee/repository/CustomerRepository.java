package io.altar.parkee.repository;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.persistence.Query;
import javax.transaction.Transactional;

import io.altar.parkee.model.Customer;

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
}
