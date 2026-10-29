import java.util.Iterator;

public class CalcularPi {
	public static void main(String[] args) {
		int c = 0;
		double[][] m = new double[2][100000];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = Math.random();
			}
		}
		
		for (int i = 0; i < m[0].length; i++) {
			if( (m[0][i]*m[0][i]+m[1][i]*m[1][i] )<1.0){
				c++;
			}
		}
		
		System.out.println(c*4);
	}
	
	

}
