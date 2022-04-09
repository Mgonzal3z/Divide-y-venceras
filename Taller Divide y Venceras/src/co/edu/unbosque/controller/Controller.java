package co.edu.unbosque.controller;

import co.edu.unbosque.view.Vista;
import co.edu.unbosque.model.AlgoritmoUno;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.InputMismatchException;

import co.edu.unbosque.model.AlgoritmoDos;
import co.edu.unbosque.model.AlgoritmoTres;


public class Controller {
	
	private Vista leer;
	private AlgoritmoUno uno;
	private AlgoritmoDos dos;
	private AlgoritmoTres tres;
		
	
	public Controller() {
		uno = new AlgoritmoUno();
		dos = new AlgoritmoDos();
		tres = new AlgoritmoTres();
		leer = new Vista();
		funcionar();
	}
	
	public void funcionar() {
		
		System.out.println("Programa Divide & Venceras");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("Elija una opcion para seguir con el programa");
		//try {
			System.out.println("\n1. Multiplicacion de grandes enteros"); 
			System.out.println("2. Multiplicacion de dos matrices con divide y venceras");
			System.out.println("3. Multiplicacion de dos matrices sin divide y venceras");
			int a = leer.leerDato("");
			boolean ok = false;
			switch(a) {
			
				case 1:	
					//while(!ok) {
						try {
						System.out.println("Inserte los numeros a multiplicar");
						BigInteger b = leer.leerEntero("Primer numero: ");
						BigInteger c = leer.leerEntero("Segundo numero: ");
						System.out.println("El resultado de su multiplicación es de: "+ uno.mEnteros(b, c));
						
						}catch(InputMismatchException e){
							System.out.println("Por favor intente de nuevo");
							
						}
					//}
					break;
				case 2:
					break;
				case 3:
					System.out.println("Ingrese las dos matrices ");
					int filaUno = leer.leerDato("Digite el numero de filas para la primera matriz:");
					int columnaUno = leer.leerDato("Digite el numero de columnas para la primera matriz:");
					int filaDos = leer.leerDato("Digite el numero de filas para la segunda matriz:");
					int columnaDos = leer.leerDato("Digite el numero de columnas para la segunda matriz:");
					
					int matrizA[][] = new int [filaUno][columnaUno];
					int matrizB[][] = new int [filaDos][columnaDos];
					int matrizResultante[][] = new int [filaUno][columnaDos];
					
					for(int fila = 0; fila < filaUno; fila++) {
						for(int columna = 0; columna < columnaUno; columna++) {
							matrizA[fila][columna] = leer.leerDato("Digite valor en A["+fila+"]["+columna+"]"); 
						}
					}
					for(int fila = 0; fila < filaDos; fila++) {
						for(int columna = 0; columna < columnaDos; columna++) {
							matrizB[fila][columna] = leer.leerDato("Digite valor en B["+fila+"]["+columna+"]"); 
						}
					}
					
					System.out.println("La matriz resultante es: " );
					tres.mpMatrices(filaUno, columnaUno, filaDos, columnaDos, matrizA, matrizB, matrizResultante);
			
					break;
				default:
					System.out.println("Ingrese una opcion valida");
			}
	
	

		
	}
}
