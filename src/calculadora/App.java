package calculadora;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("MI CALCULADORA MOLONA");
		System.out.println("=======================");
		System.out.println("1. Sumar");
		System.out.println("2. Resta");
		System.out.println("3. Multiplicaci�n");
		System.out.println("4. Divisi�n");
		System.out.println("5. Resto");
		System.out.println("0. Salir");
		
		System.out.print("Introduce el n�mero de operaci�n: ");
		int op = sc.nextInt();
		
		System.out.print("\nIntroduce el primer operando: ");
		double op1 = sc.nextDouble();
		
		System.out.print("\nIntroduce el segundo operando: ");
		double op2 = sc.nextDouble();
		
		System.out.println("");
		
		switch(op) {
		
		
			default: System.err.println("Error al seleccionar la operaci�n. Saliendo del programa");
		}
				
		sc.close();
		
	}

}
