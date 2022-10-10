package ui;

import java.util.Scanner;

import bll.Application;
import misc.IndexValidator;

public class EditMenu implements IMenu {

	Scanner sc = new Scanner(System.in); 
	
	@Override
	public void show() {
		short op = 0;
		short op2 = 0;
		
		do {
			System.out.println();
			displayOptions();
			System.out.println();
			op = sc.nextShort();
			
			switch(op) {
			
			case 1:
				//Seleccion por medio del catalogo.
				System.out.println("\n1. 1. Cuentas corrientes.");
				System.out.println("2. 1. Cuentas de ahorros.");
				op2 = sc.nextShort();
				
				switch(op2) {
				case 1:
					IndexValidator iv = new IndexValidator();
					
					int tempIndex = 0;
					boolean tempValidator = false;
					
					do {
						
						tempIndex = Application.selectCurrentAccountByCatalog();
						
						if(iv.indexValidatorCA(tempIndex)) {
							Application.editCurrentAccount(tempIndex);

							tempValidator = true;
						}else {
							System.out.println("Indíce inválido.");
							
						}
						
						
					}while(tempValidator = false);
							
									
					
					break;
				case 2:
                    IndexValidator iv2 = new IndexValidator();
					
					int tempIndex2 = 0;
					boolean tempValidator2 = false;
					
					do {
						
						tempIndex = Application.selectSavingsAccountByCatalog();
						
						if(iv2.indexValidatorCA(tempIndex)) {
							Application.editSavingsAccount(tempIndex);

							tempValidator = true;
						}else {
							System.out.println("Indíce inválido.");
							
						}
						
						
					}while(tempValidator = false);
					break;
				default:
					System.out.println("Opción inválida.");
					break;
				}
				
				break;
			case 2:
				System.out.println("\n==Búsqueda de cuenta por número de cuenta==");
				System.out.println("1. Buscar cuenta corriente.");
				System.out.println("2. Buscar cuenta de ahorros.");
				op2 = sc.nextShort();
				
				switch(op2) {
				case 1:
					System.out.print("Ingrese el número de cuenta: ");
					long tempAccountNumber = sc.nextLong();
					
					if(Application.currentAccountExists(tempAccountNumber)) {
						
						Application.editCurrentAccount(Application.getCurrentAccountIndex(tempAccountNumber));
						
					}else {
						System.out.println("No existe ninguna cuenta con ese número de cuenta.");
					}
					break;
				case 2:
					System.out.print("Ingrese el número de cuenta: ");
					long tempAccountNumber2 = sc.nextLong(); 
					
                    if(Application.savingsAccountExists(tempAccountNumber2)) {
						
                    	Application.editSavingsAccount(Application.getSavingsAccountIndex(tempAccountNumber2));
                    	                    
                    	
					}else {
						System.out.println("No existe ninguna cuenta con ese número de cuenta.");
					}
					
					break;
				default:
					System.out.println("Opción inválida.");
					break;
				}
				
				break;
			case 3:
				EditOrDeleteAccountMenu priorMenu = new EditOrDeleteAccountMenu();
				priorMenu.show();
				break;
			default:
				System.out.println("Opción inválida.");
				break;
			
			}
			
		}while(op != 3);
		
		
		
		
	}

	//Esto puede ser puesto en un menu superior para ahorrar codigo.
	@Override
	public void displayOptions() {
		
		System.out.println("===Menu de edición de cuentas===");
		System.out.println("1. Seleccionar una cuenta del catalogo.");
		System.out.println("2. Buscar una cuenta.");
		System.out.println("3. Volver.");
		
		
	}

}
