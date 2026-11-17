import java.util.Arrays;

/**
 * Ejemplo con peculiaridades de paso por valor/referencia de funciones.
 */
public class Pregunta {

	public static void main(String[] args) {
		int n = 5;
		doble(n); // Pasa una copia del valor (no modifica 'n')
		
		int[] v = {1, 2, 3};
		doble(v); // Pasa la referencia al array (sí modifica su contenido)
		
		String nombre = "antonio";
		aMayusculas(nombre); // String es inmutable (no modifica 'nombre')
		
		System.out.println(n);                  // Salida: 5
		System.out.println(Arrays.toString(v)); // Salida: [2, 4, 6]
		System.out.println(nombre);             // Salida: antonio
	}
	
	/**
	 * Duplica el valor recibido localmente. Al ser un tipo primitivo,
	 * no afecta a la variable original.
	 * @param n Entero a duplicar
	 */
	public static void doble(int n) {
		n = 2 * n;
	}
	
	/**
	 * Duplica cada elemento del array recibido modificando el objeto original.
	 * @param n Array de enteros a modificar
	 */
	public static void doble(int n[]) {
		for (int i = 0; i < n.length; i++) {
			n[i] = 2 * n[i];
		}
	}
	
	/**
	 * Convierte la cadena a mayúsculas en una nueva referencia local,
	 * sin alterar la variable original por ser inmutable.
	 * @param nombre Cadena de texto original
	 */
	public static void aMayusculas(String nombre) {
		nombre = nombre.toUpperCase();
	}
}
