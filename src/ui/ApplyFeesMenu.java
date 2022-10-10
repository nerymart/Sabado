package ui;

import java.util.Scanner;

import bll.Application;
import misc.DateOperator;

public class ApplyFeesMenu implements IMenu {

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
			if(DateOperator.compareDate()) {
				applyFees();
			}else {
				System.out.println("\nHoy no es la fecha válida.\n");
			}
			
			
		case 2:
			Menu priorMenu = new Menu();
			priorMenu.show();
		default:
			System.out.println("Opción inválida.");
		}
	}

	@Override
	public void displayOptions() {
		System.out.println("==Menú de penalización==");
		System.out.println("1. Agregar penalización a las cuentas de ahorros.");
		System.out.println("2. Volver.");
	}

	
    public void applyFees() {
		
		if(DateOperator.compareDate()) {
			
			Application.applyFees();
			
			System.out.println("\nCuentas penalizadas exitosamente.");
		}else {
			System.out.println("Hoy no es la fecha válida.");
		}
		
	}
	
}



