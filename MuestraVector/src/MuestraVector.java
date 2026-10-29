import java.util.Arrays;

/**
 * Muestra un vector por pantalla simulando el formato de {@link java.util.Arrays#toString(Object[])}.
 * <p>
 * Dado un vector creado por el usuario, esta función lo imprime en la consola rodeado 
 * de corchetes y con los elementos separados por comas.
 * </p>
 * 
 * <p><b>Ejemplo de uso:</b></p>
 * <pre>{@code
 * int[] w = {10, 20, 30, 40, 50};
 * // Debería mostrar por pantalla:
 * // [10, 20, 30, 40, 50]
 * }</pre>
 * 
 * <p><b>Nota de implementación:</b> Se recomienda utilizar {@link System#out#print(String)} 
 * para construir la salida dinámicamente.</p>
 *
 * @param v El vector de enteros que se va a mostrar por pantalla.
 */

public class MuestraVector {

	public static void main(String[] args) {
		int[] w = {10,20,30,40,50};
		// TODO Mostrar el vector de forma correcta		
		
		System.out.print("[");
		for (int i = 0; i < w.length - 1 ; i++) { // Escribo hasta el penúltimo elemento
			System.out.print(w[i] + ", ");
		}
		System.out.print(w[w.length-1]);// Escribo el último elemento 
		System.out.println("]");
		
		System.out.println(Arrays.toString(w));


	}

}
