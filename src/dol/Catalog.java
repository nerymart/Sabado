package dol;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Catalog implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;





	Scanner sc = new Scanner(System.in);
	
    
    
	private String bankName;
	private List<CurrentAccount> currentAccounts;
	private List<SavingsAccount> savingsAccounts;
	
	
	public Catalog() {
		currentAccounts = new ArrayList<CurrentAccount>();
		savingsAccounts = new ArrayList<SavingsAccount>();
	}
	
	
	public Catalog(String bankName) {
		super();
		this.bankName = bankName;
		currentAccounts = new ArrayList<CurrentAccount>();
		savingsAccounts = new ArrayList<SavingsAccount>();
		
	}


	public Catalog(String bankName, List<CurrentAccount> currentAccounts, List<SavingsAccount> savingsAccounts) {
		super();
		this.bankName = bankName;
		this.currentAccounts = currentAccounts;
		this.savingsAccounts = savingsAccounts;
	}



	public String getBankName() {
		return bankName;
	}


	public void setBankName(String bankName) {
		this.bankName = bankName;
	}


	public List<CurrentAccount> getCurrentAccounts() {
		return currentAccounts;
	}


	public void setCurrentAccounts(List<CurrentAccount> currentAccounts) {
		this.currentAccounts = currentAccounts;
	}


	public List<SavingsAccount> getSavingsAccounts() {
		return savingsAccounts;
	}


	public void setSavingsAccounts(List<SavingsAccount> savingsAccounts) {
		this.savingsAccounts = savingsAccounts;
	}
	

	public void addSavingsAccount(SavingsAccount sa) {
		this.savingsAccounts.add(sa);
	}
	
	public void addCurrentAccount(CurrentAccount ca) {
		this.currentAccounts.add(ca);
	}
	
	
	public void setSavingsAccount(SavingsAccount sa, int index) {
		savingsAccounts.set(index, sa);
	}
	
	public void setCurrentAccount(CurrentAccount ca, int index) {
		currentAccounts.set(index, ca);
	}
	
	
	public int getCurrentAccountsSize() {
		
		return currentAccounts.size();
	}
	
    public int getSavingstAccountsSize() {
	
    	return savingsAccounts.size();
	}
	

    public int getCurrentAccountIndex(long accountNumber) {
	    int index = 0;
     	
     	for(int i = 0; i < currentAccounts.size(); i++) {
 			
 			if(savingsAccounts.get(i).getAccountNumber() == accountNumber) {
 				index = i;
 				
 			}
 			
 		}
     	
     	
     	return index;
    }

    public int getSavingsAccountIndex(long accountNumber) {
    	int index = 0;
     	
     	for(int i = 0; i < savingsAccounts.size(); i++) {
 			
 			if(savingsAccounts.get(i).getAccountNumber() == accountNumber) {
 				index = i;
 				
 			}
 			
 		}
     	
     	
     	return index;
    }

    
	//Metodos para buscar por numero de cuenta.
   	public SavingsAccount seekSavingsAccountByAccountNumber(long accountNumber) {
     int index = 0;
    	
    	for(int i = 0; i < savingsAccounts.size(); i++) {
			
			if(savingsAccounts.get(i).getAccountNumber() == accountNumber) {
				index = i;
				
			}
			
		}
    	return savingsAccounts.get(index);
	}
	
  public  CurrentAccount seekCurrentAccountByAccountNumber(long accountNumber) {
		
    	int index = 0;  
    	
    	for(int i = 0; i < currentAccounts.size(); i++) {
			
			if(currentAccounts.get(i).getAccountNumber() == accountNumber) {
				index = i;
				
			}
			
		}
    	
    	
    	return currentAccounts.get(index);
    	
		
	}
  public CurrentAccount removeCurrent(long accountNumber) {
		
   int index =0;
  	
  	for(int i = 0; i < currentAccounts.size(); i++) {
			
			if(currentAccounts.get(i).getAccountNumber() == accountNumber) {
				currentAccounts.remove(i);
			}
			
		}
  	return (CurrentAccount) currentAccounts;
		
	}
  public SavingsAccount  removeSavings(long accountNumber) {
	     int index = 0;
	    	
	    	for(int i = 0; i < savingsAccounts.size(); i++) {
				
				if(savingsAccounts.get(i).getAccountNumber() == accountNumber) {
					savingsAccounts .remove(i);
					
				}
				
			}
	    	
	    	
	    	return (SavingsAccount) savingsAccounts;
		}
  
    
    
    //Metodos para validadr si una cuenta existe.
    public boolean savingsAccountExists(long accountNumber) {
    	boolean accountExists = false;
    	
         for(int i = 0; i < savingsAccounts.size(); i++) {
			
			if(savingsAccounts.get(i).getAccountNumber() == accountNumber) {
				accountExists = true;
				
			}
			
		}
    	
    	return accountExists;
    	
    }
	
    public boolean currentAccountExists(long accountNumber) {
    	boolean accountExists = false;
    	
        for(int i = 0; i < currentAccounts.size(); i++) {
			
			if(currentAccounts.get(i).getAccountNumber() == accountNumber) {
				accountExists = true;
				
			}
			
		}
    	
    	return accountExists;
    	
    }
    
	
    
    public int selectCurrentAccountByCatalog() {
    	int index = 0;
    	
    	System.out.println();
    	showCurrentAccountsAsAList();
    	System.out.println();
    	
    	System.out.print("Ingrese el índice de la cuenta: ");
    	index = sc.nextInt();
        index = index - 1;
    	
    	return index;
    }
    
    public int selectSavingsAccountByCatalog() {
    	int index = 0;
    	
    	System.out.println();
    	showSavingsAccountsAsAList();
    	System.out.println();
    	
    	System.out.print("Ingrese el índice de la cuenta: ");
    	index = sc.nextInt();
        index = index - 1;
    	
    	return index;
    }
    
   
    public void setSavingsAccountByIndex(SavingsAccount sa, int index) {
    	
    	savingsAccounts.set(index, sa);
    	
    }
    
    public void setCurrentAccountByIndex(CurrentAccount ca, int index) {
    	
    	currentAccounts.set(index, ca);
    	
    }
    
    
    
	/*
	 * Mostrar las cuentas como una tabla.
	*/
	

	public void showAllAccountsAsATable() {
		
		System.out.println("________________________________________________________________________________________\\n");
		System.out.printf("                    Listado de todas las cuentas del banco %s\n", bankName);
		System.out.println("________________________________________________________________________________________");
		
		
        System.out.println();
		System.out.println("________________________________________________________________________________________\n");
		System.out.println("===================================Cuentas corrientes===================================");
		System.out.println("________________________________________________________________________________________\n");
		for(int i=0; i<currentAccounts.size();i++) {
			System.out.print((i+1) + ". ");
			currentAccounts.get(i).showDataAsForm();
		}
		

        System.out.println();
		System.out.println("________________________________________________________________________________________\n");
		System.out.println("===================================Cuentas corrientes===================================");
		System.out.println("________________________________________________________________________________________\n");
		for(int i=0; i<savingsAccounts.size();i++) {
			System.out.print((i+1) + ". ");
			savingsAccounts.get(i).showDataAsForm();
		}
		
		
	}
	
	//Metodo para mostrar solo las cuentas corrientes.
	public void showCurrentAccountsAsATable() {
		
		System.out.println("________________________________________________________________________________________");
		System.out.printf("\n              Listado de las cuentas corrientes del banco %s\n", bankName);
		System.out.println("________________________________________________________________________________________");
		for(int i=0; i<currentAccounts.size();i++) {
			System.out.print((i+1) + ". ");
			currentAccounts.get(i).showDataAsForm();
		}
		
	}
	
	//metodo para mostrar solo las cuentas de ahorros.
	public void showSavingsAccountsAsATable() {
		
		System.out.println("_______________________________________________________________________________________");
		System.out.printf("\n               Listado de las cuentas de ahorro del banco %s\n", bankName);
		System.out.println("_______________________________________________________________________________________");
		for(int i=0; i<currentAccounts.size();i++) {
			System.out.print((i+1) + ". ");
			currentAccounts.get(i).showDataAsForm();
		}
		
		
	}
	
		
	
	/*
	 * Mostrar las cuentas como un listado.
	 */
	
    public void showAllAccountsAsAList() {
		
		System.out.println("________________________________________________________________________________________\\n");
		System.out.printf("                    Listado de todas las cuentas del banco %s\n", bankName);
		System.out.println("________________________________________________________________________________________");
		
		
        System.out.println();
		System.out.println("________________________________________________________________________________________\n");
		System.out.println("===================================Cuentas corrientes===================================");
		System.out.println("________________________________________________________________________________________\n");
		for(int i=0; i<currentAccounts.size();i++) {
			System.out.print((i+1) + ". ");
			currentAccounts.get(i).showDataAsRow();
		}
		

        System.out.println();
		System.out.println("________________________________________________________________________________________\n");
		System.out.println("===================================Cuentas corrientes===================================");
		System.out.println("________________________________________________________________________________________\n");
		for(int i=0; i<savingsAccounts.size();i++) {
			System.out.print((i+1) + ". ");
			savingsAccounts.get(i).showDataAsRow();
		}
		
		
	}
	
	//metodo para mostrar solo las cuentas corrientes.
	public void showCurrentAccountsAsAList() {
		
		System.out.println("________________________________________________________________________________________");
		System.out.printf("\n              Listado de las cuentas corrientes del banco %s\n", bankName);
		System.out.println("________________________________________________________________________________________");
		for(int i=0; i<currentAccounts.size();i++) {
			System.out.print((i+1) + ". ");
			currentAccounts.get(i).showDataAsRow();
		}
		
	}
	
	//metodo para mostrar solo las cuentas de ahorros.
	public void showSavingsAccountsAsAList() {
		
		System.out.println("_______________________________________________________________________________________");
		System.out.printf("\n               Listado de las cuentas de ahorro del banco %s\n", bankName);
		System.out.println("_______________________________________________________________________________________");
		for(int i=0; i<currentAccounts.size();i++) {
			System.out.print((i+1) + ". ");
			currentAccounts.get(i).showDataAsRow();
		}
		
		
	}	
		
	
	
	
	
	
	//Metodo para añadir interes
	
	public void interestAdder() {
		
		for(int i = 0; i < savingsAccounts.size(); i++) {
			
			if(savingsAccounts.get(i).getCurrency() == Currency.CORDOVAS) {
				
				savingsAccounts.get(i).setBalance(savingsAccounts.get(i).getBalance() * 1.01);
			}else {
				
				savingsAccounts.get(i).setBalance(savingsAccounts.get(i).getBalance() * 1.0075);
			}
			
			
		}
		
	}
	
	public void applyFees() {
		
		for(int i = 0; i < savingsAccounts.size(); i++) {
			
           savingsAccounts.get(i).lowBalanceFee();
			
		}
	}
	
	
	public void withdrawFromSA(int index, long amount) {
		
		savingsAccounts.get(index).withdrawMoney(amount);
		
	}
	
	public void withdrawFromCA(int index, long amount) {
		
		currentAccounts.get(index).withdrawMoney(amount);
		
	}
	

	public void depositInSA(int index, long amount) {
		
		savingsAccounts.get(index).depositMoney(amount);
		
	}
	
    public void depositInCA(int index, long amount) {
		
    	currentAccounts.get(index).depositMoney(amount);
    	
	}
}
