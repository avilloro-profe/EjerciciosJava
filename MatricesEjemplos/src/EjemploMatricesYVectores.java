import java.util.Arrays;
import java.util.Iterator;

public class EjemploMatricesYVectores {
	public static void main(String[] args) {
		int[] vectorFila ;
		int[][] matriz = new int[3][10];
		
		// Mostrar vector, quiero mostrar algo similar a 
		// [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
		
		
		for (int i = 0; i < matriz.length; i++) {
			vectorFila = matriz[i];
			System.out.print("[");
			for (int j = 0; j < vectorFila.length -1; j++) {
				System.out.print(vectorFila[j] + ", ");
			}
			System.out.println(vectorFila[vectorFila.length -1] +"]");
		}
		
	}

}
