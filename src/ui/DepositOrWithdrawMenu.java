package ui;

import java.util.Scanner;

import bll.Application;
import misc.IndexValidator;

public class DepositOrWithdrawMenu implements IMenu {

Scanner sc = new Scanner(System.in);

	
	@Override
	public void show() {
		short op = 0;
		short op2 = 0;
		short op3 = 0;
		
		do {
			System.out.println();
			displayOptions();
			System.out.println();
			op = sc.nextShort();

			switch(op) {
			case 1:
				
				System.out.println("\n1. Cuenta corriente.");
				System.out.println("2. Cuenta de ahorros.\n");
				op2 = sc.nextShort();
				
				switch(op2) {
				
				case 1:
					System.out.println("\n1. Buscar en el catálogo.");
					System.out.println("2. Buscar por número de cuenta.");
					op3 = sc.nextShort();
					
					switch(op3) {
					
					case 1:
						
						IndexValidator iv = new IndexValidator();
						
						int tempIndex = 0;
						boolean tempValidator = false;
						
						do {
							
							tempIndex = Application.selectCurrentAccountByCatalog();
							
							if(iv.indexValidatorCA(tempIndex)) {
								System.out.print("Igrese el monto a depositar: ");
								long tempAmount = sc.nextLong();
								
								Application.depositInCA(tempIndex, tempAmount);

								tempValidator = true;
							}else {
								System.out.println("Indíce inválido.");
								
							}
							
							
						}while(tempValidator = false);
								
						break;
					case 2:
						System.out.print("Ingrese el número de cuenta: ");
						long tempAccountNumber = sc.nextLong();
						
						if(Application.currentAccountExists(tempAccountNumber)) {
							
							System.out.print("Ingrese el mono a depositar: ");
							long tempAmount = sc.nextLong();
							
							Application.depositInCA(Application.getCurrentAccountIndex(tempAccountNumber), tempAmount);
							
							
							
						}else {
							System.out.println("No existe ninguna cuenta con ese número de cuenta.");
						}
						break;
					
					}
					
					break;
					
				case 2:
					System.out.println("\n1. Buscar en el catálogo.");
					System.out.println("2. Buscar por número de cuenta.");
					op3 = sc.nextShort();
					
					switch(op3) {
					
					case 1:
						
                        IndexValidator iv2 = new IndexValidator();
						
						int tempIndex = 0;
						boolean tempValidator = false;
						
						do {
							
							tempIndex = Application.selectSavingsAccountByCatalog();
							
							if(iv2.indexValidatorSA(tempIndex)) {
								System.out.print("Igrese el monto a depositar: ");
								long tempAmount = sc.nextLong();
								
								Application.depositInSA(tempIndex, tempAmount);

								tempValidator = true;
							}else {
								System.out.println("Indíce inválido.");
								
							}
							
							
						}while(tempValidator = false);
						
						
						break;
					case 2:
						System.out.print("Ingrese el número de cuenta: ");
						long tempAccountNumber = sc.nextLong();
						
						if(Application.savingsAccountExists(tempAccountNumber)) {
							
							System.out.print("Ingrese el mono a depositar: ");
							long tempAmount = sc.nextLong();
							
							Application.depositInSA(Application.getSavingsAccountIndex(tempAccountNumber), tempAmount);
							
							
							
						}else {
							System.out.println("No existe ninguna cuenta con ese número de cuenta.");
						}
						break;
					
					}
					
					break;
					
				
				default:
					System.out.println("Opción inválida.");
					break;
				
				}
				
				
				break;
				
				//Retirar
			case 2:
				System.out.println("\n1. Cuenta corriente.");
				System.out.println("2. Cuenta de ahorros.\n");
				op2 = sc.nextShort();
				
				switch(op2) {
				
				case 1:
					System.out.println("\n1. Buscar en el catálogo.");
					System.out.println("2. Buscar por número de cuenta.");
					op3 = sc.nextShort();
					
					switch(op3) {
					
					case 1:
						
						IndexValidator iv3 = new IndexValidator();
						
						int tempIndex = 0;
						boolean tempValidator = false;
						
						do {
							
							tempIndex = Application.selectCurrentAccountByCatalog();
							
							if(iv3.indexValidatorCA(tempIndex)) {
								System.out.print("Igrese el monto a retirar: ");
								long tempAmount = sc.nextLong();
								
								Application.withdrawFromCA(tempIndex, tempAmount);

								tempValidator = true;
							}else {
								System.out.println("Indíce inválido.");
								
							}
							
							
						}while(tempValidator = false);
						break;
					case 2:
						System.out.print("Ingrese el número de cuenta: ");
						long tempAccountNumber = sc.nextLong();
						
						if(Application.currentAccountExists(tempAccountNumber)) {
							
							System.out.print("Ingrese el mono a retirar: ");
							long tempAmount = sc.nextLong();
							
							Application.withdrawFromCA(Application.getCurrentAccountIndex(tempAccountNumber), tempAmount);
							
							
							
						}else {
							System.out.println("No existe ninguna cuenta con ese número de cuenta.");
						}
						break;
					
					}
					
					break;
					
				case 2:
					System.out.println("\n1. Buscar en el catálogo.");
					System.out.println("2. Buscar por número de cuenta.");
					op3 = sc.nextShort();
					
					switch(op3) {
					
					case 1:
						
                        IndexValidator iv4 = new IndexValidator();
						
						int tempIndex = 0;
						boolean tempValidator = false;
						
						do {
							
							tempIndex = Application.selectSavingsAccountByCatalog();
							
							if(iv4.indexValidatorSA(tempIndex)) {
								System.out.print("Igrese el monto a ");
								long tempAmount = sc.nextLong();
								
								Application.withdrawFromSA(tempIndex, tempAmount);

								tempValidator = true;
							}else {
								System.out.println("Indíce inválido.");
								
							}
							
							
						}while(tempValidator = false);
						
						
						break;
					case 2:
						System.out.print("Ingrese el número de cuenta: ");
						long tempAccountNumber = sc.nextLong();
						
						if(Application.savingsAccountExists(tempAccountNumber)) {
							
							System.out.print("Ingrese el mono a depositar: ");
							long tempAmount = sc.nextLong();
							
							Application.withdrawFromSA(Application.getSavingsAccountIndex(tempAccountNumber), tempAmount);
							
							
							
						}else {
							System.out.println("No existe ninguna cuenta con ese número de cuenta.");
						}
						break;
					
					}
					
					break;
					
				
				default:
					System.out.println("Opción inválida.");
					break;
				
				}
				
				
				break;
				
			case 3:
				Menu menu = new Menu();
				menu.show();
				break;
			default:
				System.out.println("Opción inválida.");
			
			}
			
		}while(op!=3);
		
	}

	@Override
	public void displayOptions() {
		System.out.println("1. Depositar dinero.");
		System.out.println("2. Retirar dinero.");
		System.out.println("3. Volver al menú principal.");
	}

}
