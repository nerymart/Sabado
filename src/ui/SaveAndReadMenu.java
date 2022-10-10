package ui;

import java.util.Scanner;

import bll.Application;
import dal.CurrentAccountDal;
import dal.SavingsAccountDal;
import dol.Catalog;
import dol.CurrentAccount;
import dol.SavingsAccount;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SaveAndReadMenu implements IMenu {
    Scanner sc = new Scanner(System.in);
	CurrentAccountDal cad = new CurrentAccountDal();
	SavingsAccountDal sad = new SavingsAccountDal();
   
    
    
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
				System.out.println("\nGuardar catalogos.");
				System.out.print("Ingrese la dirección del archivo de cuentas corrientes: ");
				cad.setFilePath(sc.next());
				System.out.print("Ingrese la dirección del archivo de cuentas de ahorro: ");
				sad.setFilePath(sc.next());
				
				saveCatalogs(Application.getSavingsAccounts(), Application.getCurrentAccounts());
				
				break;
			case 2:
				System.out.println("\nCargar catalogos.");
				System.out.print("Ingrese la dirección del archivo de cuentas corrientes: ");
				cad.setFilePath(sc.next());
				System.out.print("Ingrese la dirección del archivo de cuentas de ahorro: ");
				sad.setFilePath(sc.next());
				
				readCatalogs();
				
				break;
			case 3:
				Menu menu = new Menu();
				menu.show();
				break;
			default:
				System.out.println("Opción inválida.");
				break;
			}
			
		}while(op != 3);
	}

	@Override
	public void displayOptions() {
		System.out.println("==Escritura y lectura de datos==");
		System.out.println("1. Guardar cátalogos.");
		System.out.println("2. Leer cátalogos.");
		System.out.println("3. Volver.");
	}

	
	public void saveCatalogs(List<SavingsAccount> savingsAccounts, List<CurrentAccount> currentAccounts) {
		
		try {
			sad.save(savingsAccounts);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			cad.save(currentAccounts);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void readCatalogs() {
		
		sad.open();
		cad.open();
		
	}
}
