package co.edu.unbosque.view;

import java.math.BigInteger;
import java.util.Scanner;

public class Vista {
	
private Scanner leer;
	
	public Vista() {
		
		leer = new Scanner (System.in);
	}
	
	public void mostrarInformacion( String mensaje) {
		System.out.println(mensaje);
	}
	
	public int leerDato(String mensaje) {
		mostrarInformacion(mensaje);
		int n = leer.nextInt();
		return n;
	}
	public BigInteger leerEntero(String mensaje) {
		mostrarInformacion(mensaje);
		BigInteger n = leer.nextBigInteger();
		return n;
	}

	public Scanner getLeer() {
		return leer;
	}

	public void setLeer(Scanner leer) {
		this.leer = leer;
	}
	
	
	

}
