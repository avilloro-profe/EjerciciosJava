import java.util.Scanner;

/**
 * Ejercicio que muestra los números primos menores que 100,
 * apoyándose en la creación de una función esPrimo
 */
public class numeroPrimo {
	public static void main(String[] args) {
		for (int i = 2; i < 101; i++) {
			if(esPrimo(i)) System.out.println(i);
		}
	}
	
	
	/**
	 * Función que determina si un número entero es primo
	 * @param a
	 * @return true: si el número es primo, false en caso contrario
	 */
	public static boolean esPrimo(int a) {
		for (int i = 2; i <= Math.sqrt(a); i++) {
			if((a % i) == 0) return false;
		}
		return true;
	}

}
