import java.util.Arrays;

public class MatricesEjemplo2 {
	public static void main(String[] args) {
		int[][] m1 = new int[10][];
		int[][] m2 = new int[10][15];
		
		System.out.println(m1.length == m2.length);
		
//		System.out.println(m1[1][0]);
		System.out.println(Arrays.toString(m2[0]));
		
		
		// Forma de definir m1 con distinto tamaño de filas y columnas
		for (int i = 0; i < m1.length; i++) {
			m1[i] = new int[i+1];
			
		}
		

	}
}
