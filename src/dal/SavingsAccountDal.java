package dal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import dol.Catalog;

import dol.SavingsAccount;

public class SavingsAccountDal {
	private SavingsAccount savingsAccount;
	private String filePath;
	private final String fileName = "==Cuentas de ahorro==";
	private List<SavingsAccount> savingsAccounts;
	
	public SavingsAccountDal() {
		super();
	}

	
		
	
	public SavingsAccount getSavingsAccount() {
		return savingsAccount;
	}

	public void setSavingsAccount(SavingsAccount savingsAccount) {
		this.savingsAccount = savingsAccount;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}


	public List<SavingsAccount> getSavingsAccounts() {
		return savingsAccounts;
	}

	public void setSavingsAccounts(List<SavingsAccount> savingsAccounts) {
		this.savingsAccounts = savingsAccounts;
	}
	
	
	
	public void save(List<SavingsAccount> savingsAccount) throws FileNotFoundException, IOException {
		File SavingsAccountsFile = new File(filePath + "\\" + fileName);
			
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(SavingsAccountsFile));
			oos.writeObject(savingsAccount);
			oos.flush();
			oos.close();
		}catch(FileNotFoundException e){
			
			e.printStackTrace();
		}catch(IOException e){
			
			e.printStackTrace();
		}
	}
	
	public List<SavingsAccount> open(){
		List<SavingsAccount> savingsAccounts = new ArrayList<SavingsAccount>();
		
		File SavingsAccountsFile = new File(filePath);
		
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(SavingsAccountsFile));
			
			savingsAccounts = (List<SavingsAccount>) ois.readObject();
			
			ois.close();
			
			return savingsAccounts;
			
		}catch(FileNotFoundException e){
			
			e.printStackTrace();
		}catch(IOException e){
			
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		return null;
		
	}
	
	
	

}
