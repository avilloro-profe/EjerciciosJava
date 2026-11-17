import java.util.Arrays;
import java.util.Scanner;

public class TestStrings {
	/**
	 * Función principal
	 * @param args
	 */
	public static void main(String[] args) {
		int x, y, mayor;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		x = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Introduce otro número: ");
		y = teclado.nextInt();
		teclado.nextLine();
		
		mayor = maximo(x,y);
		System.out.println(mayor);
		teclado.close();
	}
	
	/**
	 * Esta función devuelve el mayor de dos enteros
	 * @param a, b
	 */
	public static int maximo (int a, int b) {
		if(a>b) {
			return a;
		}
		return b;
	}
	
	
	

}
