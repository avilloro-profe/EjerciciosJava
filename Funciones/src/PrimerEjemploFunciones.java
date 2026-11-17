import java.util.Arrays;
import java.util.Scanner;

/**
 * Ejemplo básico de uso de funciones con retorno de valores
 * y sobrecarga de métodos (mismo nombre, distintos parámetros).
 */
public class PrimerEjemploFunciones {
	/**
	 * Función principal donde se piden tres números al usuario
	 * y se calcula el máximo entre ellos.
	 * @param args Argumentos de la línea de comandos
	 */
	public static void main(String[] args) {
		int x, y, z;
		Scanner teclado = new Scanner(System.in); 
		
		System.out.println("Introduce un número: ");
		x = teclado.nextInt();
		teclado.nextLine(); 
		
		System.out.println("Introduce 2º número: ");
		y = teclado.nextInt();
		teclado.nextLine(); 
		
		System.out.println("Introduce 3er número: ");
		z = teclado.nextInt();
		teclado.nextLine(); 
		
		// Llamadas a las funciones sobrecargadas 'maximo'
		System.out.println("El máximo entre los 2 primeros es: " + maximo(x, y));
		System.out.println("El máximo entre los 3 primeros es: " + maximo(x, y, z));
		
		teclado.close(); 
	}
	
	/**
	 * Esta función devuelve el mayor de dos enteros.
	 * @param a Primer número entero a comparar
	 * @param b Segundo número entero a comparar
	 * @return El valor entero mayor entre 'a' y 'b'
	 */
	public static int maximo(int a, int b) {
		if (a > b) {
			return a; 
		}
		return b;     
	}
	
	/**
	 * Método sobrecargado que devuelve el mayor de tres enteros.
	 * Reutiliza la función anterior para evitar repetir código.
	 * @param n Primer número entero
	 * @param m Segundo número entero
	 * @param l Tercer número entero
	 * @return El valor entero mayor de los tres
	 */
	public static int maximo(int n, int m, int l) {
		return maximo(maximo(n, m), l);
	}
}
