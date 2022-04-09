package co.edu.unbosque.view;

import java.math.BigInteger;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Vista {
	
	 public String leerDato(String mensaje) {
	        String aux = JOptionPane.showInputDialog(mensaje);
	        return aux;
	    }

	    public void mostrarMensaje(String texto) {
	        JOptionPane.showMessageDialog(null, texto);
	    }

	    public boolean isNumeric(String cadena){
	        try {
	            Integer.parseInt(cadena);
	            return true;
	        } catch (NumberFormatException nfe){
	            return false;
	        }
	    }
	

}
