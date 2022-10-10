package ui;

import java.util.Scanner;

import bll.Application;

public class ShowAccountsMenu implements IMenu {
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
				System.out.println("\n==Mostrar todas las cuentas==");
				System.out.println("1. Mostrar como lista.");
				System.out.println("2. Mostrar como tabla.\n");
				
				op2 = sc.nextShort();
				
				switch(op2) {
				case 1:
					Application.showAllAccountsAsList();
					break;
				case 2:
					Application.showAllAccountsAsTable();
				
					break;
				default:
					System.out.println("Opción inválida.");
					break;
				}
		
				break;
			case 2:
				System.out.println("\n==Mostrar las cuentas corrientes==");
				System.out.println("1. Mostrar como lista.");
				System.out.println("2. Mostrar como tabla.\n");
				
				op2 = sc.nextShort();
				
				switch(op2) {
				case 1:
					Application.showCurrentAccountsAsList();
					break;
				case 2:
					Application.showCurrentAccountsAsTable();
				
					break;
				default:
					System.out.println("Opción inválida.");
					break;
				}
				break;
			case 3:
				System.out.println("\n==Mostrar las cuentas de ahorro==");
				System.out.println("1. Mostrar como lista.");
				System.out.println("2. Mostrar como tabla.\n");
				
				op2 = sc.nextShort();
				
				switch(op2) {
				case 1:
					Application.showSavingsAccountsAsList();
					break;
				case 2:
					Application.showSavingsAccountsAsTable();
				
					break;
				default:
					System.out.println("Opción inválida.");
					break;
				}
				break;
			case 4:
				Menu m = new Menu();
				m.show();
				break;	
			default:
				System.out.println("Opción inválida.");
				break;
			}
			
		}while(op!=4);
		
	}

	@Override
	public void displayOptions() {
		System.out.println("1. Mostrar todas las cuentas.");
		System.out.println("2. Mostrar las cuentas corrientes.");
		System.out.println("3. Mostrar las cuentas de ahorro.");
		System.out.println("4. Volver al menú principal.");
		
	}
	
	

}
