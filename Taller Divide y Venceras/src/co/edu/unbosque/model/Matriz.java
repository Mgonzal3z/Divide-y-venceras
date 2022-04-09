package co.edu.unbosque.model;

public class Matriz {
	
	public Matriz() {
	}
	
	public int[][] mpMatrices(int filaUno, int columnaUno, int filaDos, int columnaDos, int[][] matrizA, int[][] matrizB, int[][] matrizResultante) {

        for (int filaMatrizResultado = 0; filaMatrizResultado < filaUno; filaMatrizResultado++) {
            for (int columnaMatrizResultado = 0; columnaMatrizResultado < columnaDos; columnaMatrizResultado++) {
                int rpta = 0;
                for (int ncolumnA = 0; ncolumnA < columnaUno; ncolumnA++) {
                    rpta += matrizA[filaMatrizResultado][ncolumnA] * matrizB[ncolumnA][columnaMatrizResultado];
                }
                matrizResultante[filaMatrizResultado][columnaMatrizResultado] = rpta;

            }

        }
        return matrizResultante;
    }
	
	
//	public int [][] multiplicar(int [][] a, int [][] b){
//		/*Solo se pueden multiplicar si el numero de columnas
//		de la primera matriz es igual al numero de renglones de la segunda matriz*/
//		//Columnas matriz a
//		int n = a[0].length;
//		//Filas matriz a 
//		int m = a.length;
//		//Columnas matriz b
//		int	o = b[0].length;
//		//Filas matriz b
//		int p = b.length;
//		//Matriz resultante
//		int[][] c = new int [m][o];
//			if(n==o) {
//				for(int i = 0; i < n; i++) {
//					for(int j = 0; j < o; j++) {
//						int aux = 0;
//						for(int k = 0; k < p; k++) {
//							aux = aux+a[i][k]*b[k][j];
//						}
//				c[i][j] = aux;
//					}
//				}
//			}
//			return c;
//	}
	
	
}
