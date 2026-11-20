import java.util.Scanner;

/**
 * Ejercicio 5. Rectángulo hueco (1,5 puntos).
 *
 * <p>
 * Pide dos enteros: filas (altura) y columnas (anchura). Dibuja un rectángulo
 * hueco con asteriscos '*' en el borde y espacios en el interior. Cada línea
 * debe ocupar exactamente tantas posiciones como columnas se han indicado.
 * </p>
 *
 * <p>
 * Si alguna dimensión es menor o igual que cero, no dibujes el rectángulo y
 * muestra exactamente:
 * </p>
 * 
 * <pre>
 * Error: las dimensiones deben ser positivas.
 * </pre>
 *
 * <p>
 * Si hay una sola fila o una sola columna, todas las posiciones son borde y,
 * por tanto, deben ser asteriscos.
 * </p>
 *
 * <p>
 * Ejemplo de ejecución:
 * </p>
 * 
 * <pre>
 * Introduce el numero de filas: 4
 * Introduce el numero de columnas: 8
 * ********
 * *      *
 * *      *
 * ********
 * </pre>
 *
 * <p>
 * Realiza toda la actividad en main, sin crear métodos propios.
 * </p>
 *
 * @author CPIFP Bajo Aragón - 0485 Programación
 */
public class Ejercicio5 {

	/**
	 * Lee las dimensiones y dibuja el rectángulo o informa del error.
	 *
	 * @param args argumentos de consola (no se utilizan)
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce el numero de filas: ");
		int filas = teclado.nextInt();

		System.out.print("Introduce el numero de columnas: ");
		int columnas = teclado.nextInt();

		boolean valido = true;
		// TODO 1: Si filas o columnas es menor o igual que cero,
		// muestra el mensaje de error indicado y no dibujes nada.
		if (filas <= 0 || columnas <= 0) {
//			System.out.println("Dimensiones incorrectas");
			valido = false;
		}
		// TODO 2: Si ambas dimensiones son válidas, dibuja el rectángulo
		// con '*' en los bordes y espacios en el interior.
		// Comprueba también los casos de una sola fila o columna.

//        String[][] rectangulo= new String[filas][columnas];
		if (valido) {
			for (int i = 1; i <= filas; i++) {

				for (int j = 1; j <= columnas; j++) {
					if (i == 1 || i == filas || j == 1 || j == columnas) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}

				}
				System.out.println("");

			}
		} else {
			System.out.println("Error: las dimensiones deben ser positivas.");
		}
		teclado.close();
	}
}
