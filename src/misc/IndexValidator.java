package misc;

import bll.Application;
public class IndexValidator {
	
	public static boolean indexValidatorCA(int index) {
		boolean validIndex = true;
		
		if(index < 0) {
			validIndex = false;
		}else if((index+1) > Application.getCurrentAccountsSize()) {
			validIndex = false;
		}
		
		return validIndex;
		
	}
	
	
	public static boolean indexValidatorSA(int index) {
		boolean validIndex = true;
		
		if(index < 0) {
			validIndex = false;
		}else if((index+1) > Application.getSavingsAccountsSize()) {
			validIndex = false;
		}
		
		return validIndex;
		
	}
	
	

}
