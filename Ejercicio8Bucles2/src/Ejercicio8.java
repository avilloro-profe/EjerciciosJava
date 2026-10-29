import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		int n;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un número entero");
		n = teclado.nextInt();
		
		for (int linea = 0; linea < n; linea++) { 
			for (int j = 0; j < n-linea-1; j++) {
				System.out.print(" ");
			}
			for (int j=0; j<1+2*linea;j++) {
				System.out.print("*");
			}
			System.out.println();
			
			
		}
		
		teclado.close();
		
	}

}
