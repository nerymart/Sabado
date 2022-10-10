package misc;

import java.util.List;
import java.util.Collections;
import dol.Catalog;
import dol.CurrentAccount;
import dol.SavingsAccount;

public class AccountSorter {
	CurrentAccount ca = new CurrentAccount();
	SavingsAccount sa = new SavingsAccount();
	Catalog ctl = new Catalog();
	
	
	public List<CurrentAccount> sortCurrentAccountsByAccountNumber(List<CurrentAccount> currentAccounts){
		Collections.sort(currentAccounts);
		return currentAccounts;
	}
	
    
    
    public List<SavingsAccount> sortSavingsAccountsByAccountNumber(List<SavingsAccount> savingsAccounts){
    	Collections.sort(savingsAccounts);
    	return savingsAccounts;
    }
    
  
}
