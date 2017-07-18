package io.altar.parkee.repository;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

import io.altar.parkee.model.Customer;

@Named("CustomerRepository")
@ApplicationScoped
public class CustomerRepository extends EntityRepository<Customer> {
	
	public List<Customer> getDbElements() {
		
		Query query = getEm().createQuery("FROM customer");
		List<Customer> dbCustomers = (List<Customer>) query.getResultList();
		return dbCustomers;
	}
	
	@Override
	@Transactional
	public void removeFromDb(Customer customer){
		
		Customer customerToRemove = getEm().find(Customer.class, customer.getId());
		getEm().remove(customerToRemove);
	}
	
	@Transactional
	public void modifyDb(int id, String customerName, int customerContact, int nif){
		
		Customer dbCustomer = getEm().find(Customer.class, id);
		dbCustomer.setCustomerName(customerName);
		dbCustomer.setCustomerContact(customerContact);		
		dbCustomer.setNif(nif);
	}
	
//	@Transactional
//	public Customer addToDb(int id, String customerName, int customerContact, int nif){
//		Customer newCustomer =  new Customer();
//		newCustomer.setCustomerName(customerName);
//		newCustomer.setCustomerContact(customerContact);	
//		newCustomer.setNif(nif);
//		em.persist(newCustomer);
//		return newCustomer;
//	}
}
