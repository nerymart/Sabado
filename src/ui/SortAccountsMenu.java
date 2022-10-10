package ui;

import java.util.Scanner;

import bll.Application;
import misc.AccountSorter;

public class SortAccountsMenu implements IMenu {
	
Scanner sc = new Scanner(System.in); 
	
	@Override
	public void show() {
		short op = 0;
		
		do {
			System.out.println();
			displayOptions();
			System.out.println();
			op = sc.nextShort();
			
			switch(op) {
			
			case 1:
				//Aqui se ordenan las cuentas por el numero de cuenta de menor a mayor.
				AccountSorter as = new AccountSorter();
				Application.setCurrentAccounts(as.sortCurrentAccountsByAccountNumber(Application.getCurrentAccounts()));
				Application.setSavingsAccounts(as.sortSavingsAccountsByAccountNumber(Application.getSavingsAccounts()));
	
				break;
			case 2:
				Menu menu = new Menu();
				menu.show();
				break;
			default:
				System.out.println("Opción inválida.");
				break;
			
			}
			
		}while(op != 2);
		
		
		
		
	}

	//Esto puede ser puesto en un menu superior para ahorrar codigo.
	@Override
	public void displayOptions() {
		
		System.out.println("===Menu de ordenamiento de las cuentas===");
		System.out.println("1. Ordenar cuentas");
		System.out.println("2. Volver.");
		
		
	}

}
