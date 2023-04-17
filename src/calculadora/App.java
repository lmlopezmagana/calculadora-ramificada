package calculadora;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("MI CALCULADORA MOLONA");
		System.out.println("=======================");
		System.out.println("1. Sumar");
		System.out.println("2. Resta");
		System.out.println("3. Multiplicación");
		System.out.println("4. División");
		System.out.println("5. Resto");
		System.out.println("0. Salir");
		
		System.out.print("Introduce el número de operación: ");
		int op = sc.nextInt();
		
		System.out.print("\nIntroduce el primer operando: ");
		double op1 = sc.nextDouble();
		
		System.out.print("\nIntroduce el segundo operando: ");
		double op2 = sc.nextDouble();
		
		System.out.println("");
		
		switch(op) {
		
			case 1: System.out.printf("La suma de %.2f y %.2f da como resultado %.2f", op1, op2, op1+op2);
					break;
		
			default: System.err.println("Error al seleccionar la operación. Saliendo del programa");
		}
				
		sc.close();
		
	}

}
