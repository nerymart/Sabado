package ui;

import java.util.Scanner;

import bll.Application;
import misc.DateOperator;

public class AddInterestMenu implements IMenu {
    Scanner sc = new Scanner(System.in);
	
	@Override
	public void show() {
		short op = 0;
		
		System.out.println();
		displayOptions();
		System.out.println();
		
		op = sc.nextShort();
		
		switch(op) {
		case 1:
			interestAdder();
			break;
		case 2:
			
			break;
		default:
			System.out.println("Opción inválida.");
		
		}
		
	}

	@Override
	public void displayOptions() {
		System.out.println("==Menu para agregar interes==");
		System.out.println("1. Agregar interes a las cuentas de ahorro.");
		System.out.println("2. Volver.");
	}
	
	
	
	
	
	
	public void interestAdder() {
		
		if(DateOperator.compareDate()) {
			
			Application.interestAdder();
			
			System.out.println("\nInteres añadido satisfactoriamente.");
		}else {
			System.out.println("Hoy no es la fecha válida.");
		}
		
	}
	
	
	

}
