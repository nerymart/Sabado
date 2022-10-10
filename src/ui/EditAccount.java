package ui;

import java.util.Scanner;

import dol.CurrentAccount;
import dol.SavingsAccount;

public class EditAccount implements IMenu {
	Scanner sc = new Scanner(System.in);
	
	
	public CurrentAccount editCurrentAccount(CurrentAccount ca) {
		short op = 0;
		System.out.println();
		show();
		System.out.println();
		
		op = sc.nextShort();
		
		switch(op) {
		case 1:
			System.out.print("Ingrese el nuevo número: ");
			ca.setLandlinePhoneNumber(sc.nextInt());
			break;
		case 2:
            System.out.print("Ingrese el nuevo número: ");
    		ca.setMobilPhoneNumber(sc.nextInt());
    		break;
		case 3:
			System.out.println("Ingrese la nueva dirección: ");
			
			System.out.print("Departamento de residencia: ");
			ca.setHolderDepartment(sc.next());
			
			System.out.print("Municipio de residencia: ");
			ca.setHolderMunicipality(sc.next());
			
			System.out.print("Barrio de residencia: ");
			ca.setHolderNeighborhood(sc.nextLine());
			
			System.out.print("Dirección exacta: ");
			ca.setExactAddress(sc.nextLine());
			
			break;
	
		default:
			System.out.println("Opción inválida.");
			break;
		}
		
		return ca;
	}
	
	
    public SavingsAccount editSavingsAccount(SavingsAccount sa) {
    	short op = 0;
    	System.out.println();
    	show();
    	System.out.println();
    	
    	op = sc.nextShort();
    	
    	switch(op) {
    	case 1:
    		System.out.print("Ingrese el nuevo número: ");
    		sa.setLandlinePhoneNumber(sc.nextInt());
    		
    		break;
		case 2:
            System.out.print("Ingrese el nuevo número: ");
    		sa.setMobilPhoneNumber(sc.nextInt());
    		break;
		case 3:
			System.out.println("Ingrese la nueva dirección: ");
			
			System.out.print("Departamento de residencia: ");
			sa.setHolderDepartment(sc.next());
			
			System.out.print("Municipio de residencia: ");
			sa.setHolderMunicipality(sc.next());
			
			System.out.print("Barrio de residencia: ");
			sa.setHolderNeighborhood(sc.nextLine());
			
			System.out.print("Dirección exacta: ");
			sa.setExactAddress(sc.nextLine());
			
			break;
	
			
			
		default:
			System.out.println("Opción inválida.");
			break;
    	
    	}
    	
    	
    	return sa;
    }
	

    
    @Override
    public void displayOptions() {
    	System.out.println("==Opciones de modificación==");
    	System.out.println("1. Número telefónico línea fija.");
    	System.out.println("2. Número de teléfono móvil.");
    	System.out.println("3. Dirección del titular.");
    
    }


    
	@Override
	public void show() {
        
	}
}
