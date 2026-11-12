import java.util.Iterator;

/**
 * Programa que escribe los n primeros números de la secuencia de Fibonacci,
 * donde n es un número entero introducido por el usuario
 */
public class Fibonacci {
	public static void main(String[] args) {
		int n = 30;
		int f0=0, f1=1;
		
		 for (int i = 0; i < n; i++) {
			System.out.println(f0);
			f1 = f1+f0;
			f0 = f1-f0;
			
		}
	}

}
