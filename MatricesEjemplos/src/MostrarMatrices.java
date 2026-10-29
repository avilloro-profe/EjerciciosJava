import java.util.Arrays;

public class MostrarMatrices {
	public static void main(String[] args) {
		int[][] m = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
	
		for (int i = 0; i < m.length; i++) { // filas 
			System.out.print("[");
			for (int j = 0; j < m.length-1; j++) { // columnas
				System.out.print(m[i][j] + ", ");
			}
			System.out.println(m[i][m.length-1] + "]");
		}
	
	}
}
	
