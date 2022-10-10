package dol;

public interface ISavingsAccount {

	//Tasas de interes para las cuentas tanto en dolares como en cordobas.
	final double INTEREST_RATE_CORDOVAS = 0.01;
    final double INTEREST_RATE_DOLARS = 0.0075;
    
    //Penalidades mensuales si el balance es menor al minimo(C$1000 o $100)
    final int LOW_BALANCE_FEE_CORDOVAS = 375;
    final int LOW_BALANCE_FEE_DOLARS = 15;

}
