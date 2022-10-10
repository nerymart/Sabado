package misc;

import java.util.Scanner;
import java.lang.IllegalArgumentException;

public class BalanceCatcher {
	Scanner sc = new Scanner(System.in);
	
	//Obtener un balance correcto.
	
	//Debo convertir los misc a staticos para ahorrar memoria.
	
	public double catchAmount() {
		double amount = 0;
		long wholePart = 0;
		double cents = 0;
		
		
		do {
			
			do {
				System.out.print("Monto de la parte entera: ");
				
				try {
					wholePart = sc.nextLong();
					
				}catch(IllegalArgumentException e) {
					
				System.out.println("Error. Favor de ingresar un valor entero.");	
				}		
				
			}while(wholePart == 0);
			
			
			if(wholePart <= 0) {
				System.out.println("El monto no puede ser menor que 1.");
			}
			
		}while(wholePart <= 0);
		
		
		
		
		do {
			System.out.print("Monto de los centavos: ");
			cents = sc.nextFloat();
			if(cents<0 || cents> 0.99) {
				System.out.println("Monto de centavos inválido.");
			}
		
		}while(cents<0 || cents > 0.99);
		
		amount = wholePart + cents;
		
		return amount;
	}
	
	
	

}
