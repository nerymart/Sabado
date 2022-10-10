package dol;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public abstract class Account {
	
	//Saldo de la cuenta.
	private double balance;
	//Número de la cuenta.
	private long accountNumber;
	
	//Nombre del titular de la cuenta.
	private String holderFirstName;
	private String holderMiddleName;
	private String holderSurname;
	private String holderSecondSurname;
	
	//Fecha de nacimiento del titular
	private Date birthDate;
	private int age;
	
	
	//Cédula del titular de la cuenta.
	private String holderID;
	
	//Número de contacto linea fija
	private int landlinePhoneNumber;
	
	//número de contacto movil.
	private int mobilPhoneNumber;
	
	//Direción del titular.
	private String holderDepartment; //Departamento
	private String holderMunicipality; //Municipio
	private String holderNeighborhood; //Barrio
	private String exactAddress; //Direccion exacta.
	
	//Fecha de creacion de la cuenta.
	private LocalDateTime creationDate;
	
	
	//Tipo de moneda utilizada en la cuenta (Dólares o Córdobas).
	private Currency currency;
	
	//Historial de transacciones de la cuenta.
	private String transactionHistory;
	
	

	public Account() {
		super();
	}


	









	public Account(double balance, long accountNumber, String holderFirstName, String holderMiddleName,
			String holderSurname, String holderSecondSurname, Date birthDate, int age, String holderID, int landlinePhoneNumber,
			int mobilPhoneNumber, String holderDepartment, String holderMunicipality, String holderNeighborhood,
			String exactAddress, LocalDateTime creationDate, Currency currency, String transactionHistory) {
		super();
		this.balance = balance;
		this.accountNumber = accountNumber;
		this.holderFirstName = holderFirstName;
		this.holderMiddleName = holderMiddleName;
		this.holderSurname = holderSurname;
		this.holderSecondSurname = holderSecondSurname;
		this.birthDate = birthDate;
		this.age = age;
		this.holderID = holderID;
		this.landlinePhoneNumber = landlinePhoneNumber;
		this.mobilPhoneNumber = mobilPhoneNumber;
		this.holderDepartment = holderDepartment;
		this.holderMunicipality = holderMunicipality;
		this.holderNeighborhood = holderNeighborhood;
		this.exactAddress = exactAddress;
		this.creationDate = creationDate;
		this.currency = currency;
		this.transactionHistory = transactionHistory;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}


	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getHolderFirstName() {
		return holderFirstName;
	}

	public void setHolderFirstName(String holderFirstName) {
		this.holderFirstName = holderFirstName;
	}

	public String getHolderMiddleName() {
		return holderMiddleName;
	}

	public void setHolderMiddleName(String holderMiddleName) {
		this.holderMiddleName = holderMiddleName;
	}

	public String getHolderSurname() {
		return holderSurname;
	}

	public void setHolderSurname(String holderSurname) {
		this.holderSurname = holderSurname;
	}

	public String getHolderSecondSurname() {
		return holderSecondSurname;
	}

	public void setHolderSecondSurname(String holderSecondSurname) {
		this.holderSecondSurname = holderSecondSurname;
	}

	public String getHolderID() {
		return holderID;
	}

	public void setHolderID(String holderID) {
		this.holderID = holderID;
	}

	public LocalDateTime getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDateTime creationDate) {
		this.creationDate = creationDate;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}


    public String getHolderDepartment() {
		return holderDepartment;
	}
	public void setHolderDepartment(String holderDepartment) {
		this.holderDepartment = holderDepartment;
	}
	public String getHolderMunicipality() {
		return holderMunicipality;
	}
	public void setHolderMunicipality(String holderMunicipality) {
		this.holderMunicipality = holderMunicipality;
	}
	public String getHolderNeighborhood() {
		return holderNeighborhood;
	}
	public void setHolderNeighborhood(String holderNeighborhood) {
		this.holderNeighborhood = holderNeighborhood;
	}
	public String getExactAddress() {
		return exactAddress;
	}
	
	public int getLandlinePhoneNumber() {
		return landlinePhoneNumber;
	}


	public void setLandlinePhoneNumber(int landlinePhoneNumber) {
		this.landlinePhoneNumber = landlinePhoneNumber;
	}


	public int getMobilPhoneNumber() {
		return mobilPhoneNumber;
	}


	public void setMobilPhoneNumber(int mobilPhoneNumber) {
		this.mobilPhoneNumber = mobilPhoneNumber;
	}

	public void setExactAddress(String exactAdddress) {
		this.exactAddress = exactAdddress;
	}




	public String getTransactionHistory() {
		return transactionHistory;
	}




	public void setTransactionHistory(String transactionHistory) {
		this.transactionHistory = transactionHistory;
	}



	
	
	
	/*
	 *En los posteriores metodos se debe agregar la opcion de disminuir o aumentar el balance, cada vez que 
	 *que se realize una de esttas dos transacciones se debe agregar al historial en el formato de:
	 *
	 *    # de transaccion + fecha + Deposito/Reiro + "-----------" + monto de la transaccion + Saldo remanente.
	 *    
	 *    Se debe guardar con un salto de linea (Una transaccion debajo de otra), y dejar una linea en blanco
	 *    en medio de las transacciones.
	 */
	
	

	public abstract void withdrawMoney(double amount);
		
	public abstract void depositMoney(double amount);












	public int getAge() {
		return age;
	}












	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
	
	
	
	
	
}
