import java.util.Scanner;

/**
 * Ejemplo en el que mostramos el funcionamiento de una función 
 * sin parámetro de retorno (void)
 */
public class Saludar {
	public static void main(String[] args) {
		String nombre;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame tu nombre: ");
		nombre = teclado.nextLine();
		funcionSaludar(nombre);
		teclado.close();
	}
	
	/**
	 * Ejemplo de función sin parámetros de salida
	 * @param nombre
	 */
	public static void funcionSaludar(String nombre) {
		System.out.println("Bienvenido " + nombre);
	}
}
