import java.util.Scanner;

/**
 * Ejercicio 3. Caracteres sin repetir (1,5 puntos).
 *
 * <p>Pide una palabra al usuario y determina si todos sus caracteres
 * son distintos. Si aparece algún carácter más de una vez, indica
 * que la palabra contiene caracteres repetidos; en caso contrario,
 * indica que no contiene caracteres repetidos.</p>
 *
 * <p>La palabra no está vacía y no contiene espacios. Las mayúsculas
 * y las minúsculas se consideran equivalentes: 'A' y 'a' son la misma
 * letra. Puedes utilizar los métodos de biblioteca y las estructuras
 * de Java que prefieras, pero realiza el ejercicio dentro de main,
 * sin crear métodos propios.</p>
 *
 * <p>Ejemplos de ejecución:</p>
 * <pre>
 * Introduce una palabra: Cuenco
 * La palabra contiene caracteres repetidos.
 * </pre>
 * <pre>
 * Introduce una palabra: murcielago
 * La palabra no contiene caracteres repetidos.
 * </pre>
 *
 * @author CPIFP Bajo Aragón - 0485 Programación
 */
public class Ejercicio3 {

    /**
     * Lee una palabra y muestra si tiene caracteres repetidos.
     *
     * @param args argumentos de consola (no se utilizan)
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce una palabra: ");
        String palabra = teclado.nextLine();
        palabra.toUpperCase();
        
        boolean repetido = false; 

        // TODO 1: Comprueba si algún carácter aparece más de una vez,
        //         sin distinguir mayúsculas de minúsculas.
        //         Puedes elegir libremente los métodos de biblioteca
        //         y las estructuras de control que necesites.

        for (int i = 0; i < palabra.length() - 1 ; i++) {
			if( palabra.indexOf(palabra.charAt(i),i+1) != -1) repetido = true; 
		}
        // TODO 2: Muestra el mensaje correspondiente según el resultado.
        if(repetido) {
        	System.out.println("La palabra contiene caracteres repetidos");
        }else {
        	System.out.println("La palabra no contiene caracteres repetidos");
        }
    }
}