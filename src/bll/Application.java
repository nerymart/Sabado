package bll;

import java.util.List;

import dol.Catalog;
import dol.CurrentAccount;
import dol.SavingsAccount;
import ui.EditAccount;
import ui.FormAccount;

public class Application {
	
	
	static Catalog ctl = new Catalog();	
	
	public static int getCurrentAccountsSize() {
	
		return ctl.getCurrentAccountsSize();
	}
	
	public static int getSavingsAccountsSize() {
		
		return ctl.getSavingstAccountsSize();
	}
	
	
	public static void addCurrentAccount(CurrentAccount ca) {
		ctl.addCurrentAccount(ca);
		
	}
	
	public static void catchCurrentAccount() {
		FormAccount fa = new FormAccount();
		addCurrentAccount(fa.catchCurrentAccount());
	}
	
	
	
	//Metodos para mostrar las cuentas.
	public static void showCurrentAccountsAsTable() {
		
		ctl.showCurrentAccountsAsATable();
	}
	
    public static void showSavingsAccountsAsTable() {
		
    	ctl.showSavingsAccountsAsATable();
	}
	
    public static void showAllAccountsAsTable() {
		ctl.showAllAccountsAsATable();
    	
	}
	
	public static void showCurrentAccountsAsList() {
		
		ctl.showCurrentAccountsAsAList();
	}
	
    public static void showSavingsAccountsAsList() {
		
    	ctl.showSavingsAccountsAsAList();
	}
	
    public static void showAllAccountsAsList() {
		ctl.showAllAccountsAsAList();
    	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public static void addSavingsAccount(SavingsAccount sa) {
		ctl.addSavingsAccount(sa);
		
	}
	
	public static void catchSavingsAccount() {
		FormAccount fa = new FormAccount();
		addSavingsAccount(fa.catchSavingsAccount());
	
	}
	
	public static List<CurrentAccount> getCurrentAccounts() {
		
		return ctl.getCurrentAccounts();
	}
	
    public static List<SavingsAccount> getSavingsAccounts() {
		
		return ctl.getSavingsAccounts();
	}
	
	public static void setCurrentAccounts(List<CurrentAccount> currentAccounts) {
		
		ctl.setCurrentAccounts(currentAccounts);
		
	}
	
    public static void setSavingsAccounts(List<SavingsAccount> savingsAccounts) {
		
    	ctl.setSavingsAccounts(savingsAccounts);
	}
    
    
    public static int selectCurrentAccount() {
    	
    	int index = ctl.selectCurrentAccountByCatalog();
    	
    	return index;
    }
    
   public static int selectSavingsAccount() {
    	
	   int index = ctl.selectSavingsAccountByCatalog();
    	
	   return index;
    }
   public static CurrentAccount removeElement(long accountNumber) {
	   
	  
	return ctl.removeCurrent(accountNumber);
	   
	   
	   
   }
   public static SavingsAccount removeElement2(long accountNumber) {
	  
	   return ctl.removeSavings(accountNumber);
   }
   
   
   
   
   public static SavingsAccount getSavingsAccountByIndex(int index) {
	   
	   return ctl.getSavingsAccounts().get(index);
   }
   
   
   public static CurrentAccount getCurrentAccountByIndex(int index) {
	   
	   return ctl.getCurrentAccounts().get(index);
	   
   }
   
   public static void setSavingsAccountByIndex(SavingsAccount sa, int index) {
	   
	   ctl.setSavingsAccountByIndex(sa, index);
	   
   }
   
   public static void setCurrentAccountByIndex(CurrentAccount ca, int index) {
	   
	   ctl.setCurrentAccountByIndex(ca, index);
   }
 
 
   
   public static void editSavingsAccount(int index) {
	  EditAccount ea = new EditAccount(); 
	   
	  setSavingsAccountByIndex(ea.editSavingsAccount(getSavingsAccountByIndex(index))   , index); 
	   
   }
    
   public static void editCurrentAccount(int index) {
	   EditAccount ea = new EditAccount();
	   
	   setCurrentAccountByIndex(ea.editCurrentAccount(getCurrentAccountByIndex(index))   , index);
   }
   
   public static int selectSavingsAccountByCatalog() {
	   
	   return ctl.selectSavingsAccountByCatalog();
   }
   
   public static int selectCurrentAccountByCatalog() {
	   
	   return ctl.selectCurrentAccountByCatalog();
   }
   
   public static boolean currentAccountExists(long accountNumber) {
	   
	   if(ctl.currentAccountExists(accountNumber)) {
		   return true;
	   }else {
		   return false;
	   }
   }
   
   public static boolean savingsAccountExists(long accountNumber) {
	   
	   if(ctl.savingsAccountExists(accountNumber)) {
		   return true;
	   }else {
		   return false;
	   }
   }
   
   public static int getSavingsAccountIndex(long accountNumber) {
	   
	   return ctl.getSavingsAccountIndex(accountNumber);
   }
  
   public static int getCurrentAccountIndex(long accountNumber) {
	   
	   return ctl.getCurrentAccountIndex(accountNumber);
   }
  
   public static CurrentAccount seekCurrentAccountByAccountNumber(long accountNumber) {
	   
	  return ctl.seekCurrentAccountByAccountNumber(accountNumber);
	   
   }
   
   public static SavingsAccount seekSavingsAccountByAccountNumber(long accountNumber) {
	
	   return ctl.seekSavingsAccountByAccountNumber(accountNumber); 
   }
   
   
   
   
   
   
   //Metodo para añadir interest
   public static void interestAdder() {
	   ctl.interestAdder();
	   
   }
   
   
   //metodo para aplicar la penalización.
   public static void applyFees() {
	   ctl.applyFees();
	   
   }
   
   
   
   
  //Metodos para depositar y retirar dinero
   
   public static void depositInSA(int index, long amount) {
	   
	   ctl.depositInSA(index, amount);
   }
   
   
 public static void depositInCA(int index, long amount) {
	   
	  ctl.depositInCA(index, amount);
   }
   
 public static void withdrawFromSA(int index, long amount) {
	   
	 ctl.withdrawFromSA(index, amount);
 }
 
 public static void withdrawFromCA(int index, long amount) {
	   
	 ctl.withdrawFromCA(index, amount);
	 
 }


   
   
   
   
   
   
   
}
