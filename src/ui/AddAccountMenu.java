package ui;

import java.util.Scanner;

import bll.Application;

public class AddAccountMenu implements IMenu {
    Scanner sc = new Scanner(System.in);
	FormAccount fa = new FormAccount();
    
    
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
				System.out.println("__________________________________\n");
				System.out.println("===Agregar una cuenta corriente===");
				System.out.println("__________________________________\n");
				
				Application.catchCurrentAccount();
				
				break;
			case 2:
				System.out.println("___________________________________\n");
				System.out.println("===Agregar una cuenta de ahorros===");
				System.out.println("___________________________________\n");
				
				Application.catchSavingsAccount();
				
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
		System.out.println("1. Agregar nueva cuenta corriente.");
		System.out.println("2. Agregar nueva cuenta de ahorros.");
		System.out.println("3. Volver al menú principal.");
	
	}

}
