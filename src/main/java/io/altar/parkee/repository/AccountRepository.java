package io.altar.parkee.repository;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import io.altar.parkee.model.Account;

@Named("AccountRepository")
@ApplicationScoped
public class AccountRepository extends EntityRepository<Account> {

	public List<Account> getDbElements() {
		Query query = getEm().createQuery("FROM Accounts");
		List<Account> dbAccounts = (List<Account>) query.getResultList();
		return dbAccounts;
	}
	
	@PersistenceContext(name="database")
	private EntityManager em;

	
	@Transactional
	public boolean loginControl(String email, String password){
		try{
			System.out.println(email);
			System.out.println(password);
			Account l = em.createNamedQuery("Account.control", Account.class).setParameter("email", email).setParameter("password", password).getSingleResult();
//			Login l = (Login) em.createNativeQuery("SELECT * FROM LOGIN WHERE Username = '"+ username + "' and Password = '" + password + "'", Login.class).getResultList().get(0);
//			Login l = (Login) em.createNativeQuery("SELECT * FROM LOGIN", Login.class).getResultList().get(0);
			System.out.println(l);
			if(l != null){
				return true;
			}
			return false;
		}catch (Exception e){
			System.out.println("teste "+ e.getMessage());
			return false;
		}
	}
}
