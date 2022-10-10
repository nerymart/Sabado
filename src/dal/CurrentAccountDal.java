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

import dol.CurrentAccount;
import dol.SavingsAccount;

public class CurrentAccountDal {
	private CurrentAccount currentAccount;
	private String filePath;
	private final String fileName = "==Cuentas corrientes==";
	private List<CurrentAccount> currentAccounts;
	
	
	public CurrentAccountDal() {
		super();
	}


	public CurrentAccount getCurrentAccount() {
		return currentAccount;
	}


	public void setCurrentAccount(CurrentAccount currentAccount) {
		this.currentAccount = currentAccount;
	}


	public String getFilePath() {
		return filePath;
	}


	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}


	public List<CurrentAccount> getCurrentAccounts() {
		return currentAccounts;
	}


	public void setCurrentAccounts(List<CurrentAccount> currentAccounts) {
		this.currentAccounts = currentAccounts;
	}
	
	public void save(List<CurrentAccount> currentAccounts) throws FileNotFoundException, IOException {
		File CurrentAccountsFile = new File(filePath + "\\" + fileName);
			
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(CurrentAccountsFile));
			oos.writeObject(currentAccounts);
			oos.flush();
			oos.close();
		}catch(FileNotFoundException e){
			
			e.printStackTrace();
		}catch(IOException e){
			
			e.printStackTrace();
		}
	}
	
	public List<CurrentAccount> open(){
		List<CurrentAccount> currentAccounts = new ArrayList<CurrentAccount>();
		
		File CurrentAccountsFile = new File(filePath);
		
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(CurrentAccountsFile));
			
			currentAccounts = (List<CurrentAccount>) ois.readObject();
			
			ois.close();
			return currentAccounts;
			
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
