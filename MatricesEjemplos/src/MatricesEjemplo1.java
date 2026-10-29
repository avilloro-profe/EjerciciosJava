import java.util.Arrays;
import java.util.Iterator;

public class MatricesEjemplo1 {
	public static void main(String[] args) {
		int[][] m = new int[10][5];
		int[] v = {1,2};
		
		System.out.println(m.length);
		System.out.println(m[1].length);
		
		m[0][3] = 5;
		m[1][2] = 10;
		System.out.println(m[10][1]);
		m[2] = v;
		

		for (int i = 0; i < m.length; i++) { // m[i] es un vector
		
			System.out.print("[");
			for (int j = 0; j <m[i].length ; j++) {
				System.out.print(m[i][j] + ", " ); 
			}
			System.out.println(m[i][(m[i].length-1)] + "]");
		}
		
		
	}

}
