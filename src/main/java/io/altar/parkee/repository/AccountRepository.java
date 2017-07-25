package io.altar.parkee.repository;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.persistence.Query;

import io.altar.parkee.model.Account;
import io.altar.parkee.model.Vehicle;

@Named("AccountRepository")
@ApplicationScoped
public class AccountRepository extends EntityRepository<Account> {

	public List<Account> getDbElements() {
		Query query = getEm().createQuery("FROM Accounts");
		List<Account> dbAccounts = (List<Account>) query.getResultList();
		return dbAccounts;
	}
	
	
}
