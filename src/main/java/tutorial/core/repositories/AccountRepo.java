package tutorial.core.repositories;

import java.util.List;

import tutorial.core.models.entities.Account;

public interface AccountRepo {

	public Account findAccount(Long id);

	public Account createAccount(Account data);

	public Account findAccountByName(String name);
	
	public List<Account> findAllAccounts();
	
}
