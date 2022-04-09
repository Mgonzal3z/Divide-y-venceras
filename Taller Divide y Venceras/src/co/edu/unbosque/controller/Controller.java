package co.edu.unbosque.controller;

import co.edu.unbosque.view.Vista;
import co.edu.unbosque.model.MultiplicarEnteroGrande;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.InputMismatchException;

import co.edu.unbosque.model.MatrizDivide;
import co.edu.unbosque.model.Matriz;


public class Controller {
	
	private Vista leer;
	private MultiplicarEnteroGrande uno;
	private MatrizDivide dos;
	private Matriz tres;
		
	
	public Controller() {
		uno = new MultiplicarEnteroGrande();
		dos = new MatrizDivide();
		tres = new Matriz();
		leer = new Vista();
		funcionar();
	}
	
	public void funcionar() {
		
		String aa =leer.leerDato("Programa Divide & Venceras" +
				"\n---------------------------------------------------------------------------"+
				"\n1. Multiplicacion de grandes enteros"+
				"\n2. Multiplicacion de dos matrices sin divide y venceras"+
				"\n3. Multiplicacion de dos matrices con divide y venceras"+
				"\n---------------------------------------------------------------------------"+
				"\nIngrese el número de la opción que desea utilizar:");
			int a= Integer.parseInt(aa);
		
			switch(a) {
			
				case 1:	
					boolean bandera=true;
					while(bandera) {
					try {
						String b = leer.leerDato("Inserte los numeros a multiplicar" + "\nPrimer numero: ");
						String c = leer.leerDato("Segundo numero: ");
						BigInteger bb = new BigInteger(b);
						BigInteger cc = new BigInteger(c);
						//if((leer.isNumeric(b)==true)&&(leer.isNumeric(c)==true)){
							leer.mostrarMensaje("El resultado de su multiplicación es de: "+ uno.mEnteros(bb, cc));
							bandera=false;
						}catch(NumberFormatException e){
							leer.mostrarMensaje("Ingrese solo números");
							
						}
					}
					break;
				case 2:
					int filaUno= Integer.parseInt(leer.leerDato("Ingrese las dos matrices "+"\nDigite el numero de filas para la primera matriz:"));
					int columnaUno = Integer.parseInt(leer.leerDato("Digite el numero de columnas para la primera matriz:"));
					int filaDos = Integer.parseInt(leer.leerDato("Digite el numero de filas para la segunda matriz:"));
					int columnaDos = Integer.parseInt(leer.leerDato("Digite el numero de columnas para la segunda matriz:"));

					int matrizA[][] = new int [filaUno][columnaUno];
					int matrizB[][] = new int [filaDos][columnaDos];
					int matrizResultante[][] = new int [filaUno][columnaDos];

					for(int fila = 0; fila < filaUno; fila++) {
						for(int columna = 0; columna < columnaUno; columna++) {
							matrizA[fila][columna] = Integer.parseInt(leer.leerDato("Digite valor en A["+(fila+1)+"]["+(columna+1)+"]"));
						}
					}
					for(int fila = 0; fila < filaDos; fila++) {
						for(int columna = 0; columna < columnaDos; columna++) {
							matrizB[fila][columna] = Integer.parseInt(leer.leerDato("Digite valor en B["+(fila+1)+"]["+(columna+1)+"]"));
						}
					}
					String resul1="";
					int[][] resul= tres.mpMatrices(filaUno, columnaUno, filaDos, columnaDos, matrizA, matrizB, matrizResultante);
					for (int x=0; x < filaUno; x++) {
						for (int y=0; y < columnaDos; y++) {
								resul1+=resul[x][y];
								resul1+="        ";
						}
						resul1+="\n";
					}
					leer.mostrarMensaje("La matriz resultante es:\n"+resul1);
					break;
				case 3:
					
					break;
				default:
					System.out.println("Ingrese una opcion valida");
			}
	
	

		
	}
}
