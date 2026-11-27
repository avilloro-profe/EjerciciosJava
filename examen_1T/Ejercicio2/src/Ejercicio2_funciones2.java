import java.util.Iterator;

/**
 * Ejercicio 2. Comprobación de una matriz (2,5 puntos + 0,5 extra).
 *
 * <p>
 * Se proporciona una matriz cuadrada de enteros. Comprueba si todas sus filas y
 * todas sus columnas suman exactamente lo mismo. En este ejercicio llamaremos
 * «matriz mágica» a esta condición básica.
 * </p>
 *
 * <p>
 * No hay que pedir la matriz por teclado. Las matrices m1, m2, m3, m4 y m5 ya
 * se declaran en main. Se permiten valores negativos y repetidos; no es
 * necesario comprobar su rango ni que sean distintos.
 * </p>
 *
 * <p>
 * Muestra primero la matriz, con una fila por línea. Cada fila debe estar entre
 * paréntesis y sus números separados por comas, sin espacios:
 * (valor1,valor2,...,valorN).
 * </p>
 *
 * <p>
 * Ejemplo de ejecución con m1:
 * </p>
 * 
 * <pre>
 * Matriz:
 * (8,1,6)
 * (3,5,7)
 * (4,9,2)
 * La matriz cumple la condicion de filas y columnas.
 * Suma comun: 15
 * </pre>
 *
 * <p>
 * Ampliación voluntaria (+0,5 puntos): comprueba además que las sumas de la
 * diagonal principal y de la secundaria son iguales a la suma común de las
 * filas y columnas. Muestra por separado el resultado de esta condición
 * ampliada.
 * </p>
 *
 * <p>
 * Realiza toda la actividad en main, sin crear métodos propios.
 * </p>
 *
 * @author CPIFP Bajo Aragón - 0485 Programación
 */
public class Ejercicio2_funciones2 {

	/**
	 * Ejercicio 2. Comprobación de una matriz (2,5 puntos + 0,5 extra).
	 *
	 * <p>
	 * Se proporciona una matriz cuadrada de enteros. Comprueba si todas sus filas y
	 * todas sus columnas suman exactamente lo mismo. En este ejercicio llamaremos
	 * «matriz mágica» a esta condición básica.
	 * </p>
	 *
	 * <p>
	 * No hay que pedir la matriz por teclado. Las matrices m1, m2, m3, m4 y m5 ya
	 * se declaran en main. Se permiten valores negativos y repetidos; no es
	 * necesario comprobar su rango ni que sean distintos.
	 * </p>
	 *
	 * <p>
	 * Muestra primero la matriz, con una fila por línea. Cada fila debe estar entre
	 * paréntesis y sus números separados por comas, sin espacios:
	 * (valor1,valor2,...,valorN).
	 * </p>
	 *
	 * <p>
	 * Ejemplo de ejecución con m1:
	 * </p>
	 * 
	 * <pre>
	 * Matriz:
	 * (8,1,6)
	 * (3,5,7)
	 * (4,9,2)
	 * La matriz cumple la condicion de filas y columnas.
	 * Suma comun: 15
	 * </pre>
	 *
	 * <p>
	 * Ampliación voluntaria (+0,5 puntos): comprueba además que las sumas de la
	 * diagonal principal y de la secundaria son iguales a la suma común de las
	 * filas y columnas. Muestra por separado el resultado de esta condición
	 * ampliada.
	 * </p>
	 *
	 * <p>
	 * Realiza toda la actividad en main, sin crear métodos propios.
	 * </p>
	 *
	 * @author CPIFP Bajo Aragón - 0485 Programación
	 */
	public class Ejercicio2 {
		
		
		
		
		// TODO 2.1: Crea un método que dada una matriz y una fila, devuelva el valor
		// de la suma de los elementos de la fila 
		public static int sumaFilas(int[][] matriz, int numFila) {
			return 15;
		}
		
		// TODO 2.2: Crea un método que dada una matriz y una columna, devuelva el valor
		// de la suma de los elementos de la columna 
		
		// TODO 2: Comprueba si TODAS las filas y columnas tienen
				// exactamente la misma suma.
		
		// TODO 3: Crea un método que dada una matriz, compruebe
		//si es mágica. Puedes (debes) usar los métodos creados 
		// en 2.1 y 2.2 
		
		public static boolean esMagica(int[][] matriz) {
			// recorrer la matriz por filas y columnas y utilizando el método de 
			//2.1 y 2.2 y comprobar que las filas y columnas suman lo mismo
			
			// Necesito un valor con el que comparar, tomo el de la primera fila
			int valorMagico = sumaFilas(matriz, 0);
			
			
			// Recorro los posibles valores de filas de la matriz y compruebo
			// si valen lo mismo que el valorMagico. Si en algún momento no vale lo mismo
			// puedo asegurar que la matriz no es mágica: -> return false
			for (int i = 1; i < matriz.length; i++) {
				if(sumaFilas(matriz, i) != valorMagico) {
					return false;
				}
			}
			
			
			
			
			
			return true; 
		}
		
		
		// TODO 4.1: Crea un método que dada una matriz, devuelva el valor de su diagonal
		// principal
					
		// TODO 4.2: Crea un método que dada una matriz, devuelva el valor de su diagonal
		// secundaria
	
		/**
		 * Contiene las matrices de prueba y el trabajo pendiente del ejercicio.
		 *
		 * @param args argumentos de consola (no se utilizan)
		 */
		public static void main(String[] args) {
			int[][] m1 = { { 8, 1, 6 }, { 3, 5, 7 }, { 4, 9, 2 } };
			int[][] m2 = { { 1, 2 }, { 3, 4 } };
			int[][] m3 = { { 1, 2, 3 }, { 3, 2, 1 }, { 2, 2, 2 } };
			int[][] m4 = { { 1, 1 }, { 1, 1 } };
			int[][] m5 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
	
			int[][] matriz = m1; // Cambia m1 por m2, m3, m4 o m5 para probar.
	
			System.out.println("Matriz:");
	
			// TODO 1: Crea una función llamada muestraMatriz, que muestrela matriz completa, 
			// con una fila por línea, siguiendo el formato (valor1,valor2,...,valorN).
			// Debes invocarla a continuación 
			
		
			
			// TODO 3.1: cambia el valor de condición para ver si la matriz es perfecta
			if (condición) {
				System.out.println("La matriz cumple la condicion de filas y columnas");
				System.out.println("Suma comun: " + sumaFila[0]);
			} else {
				System.out.println("La matriz NO cumple la condicion de filas y columnas");
			}
			
			
						
			
	
		}
	}

	/**
	 * Contiene las matrices de prueba y el trabajo pendiente del ejercicio.
	 *
	 * @param args argumentos de consola (no se utilizan)
	 */
	public static void main(String[] args) {
		int[][] m1 = { { 8, 1, 6 }, { 3, 5, 7 }, { 4, 9, 2 } };
		int[][] m2 = { { 1, 2 }, { 3, 4 } };
		int[][] m3 = { { 1, 2, 3 }, { 3, 2, 1 }, { 2, 2, 2 } };
		int[][] m4 = { { 1, 1 }, { 1, 1 } };
		int[][] m5 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int[][] matriz = m1; // Cambia m1 por m2, m3, m4 o m5 para probar.

		System.out.println("Matriz:");

		// TODO 1: Muestra la matriz completa, con una fila por línea,
		// siguiendo el formato (valor1,valor2,...,valorN).
		for (int i = 0; i < matriz.length; i++) {
			System.out.print("(");
			for (int j = 0; j < matriz[i].length - 1; j++) {
				System.out.print(matriz[i][j] + ",");
			}
			System.out.println(matriz[i][matriz[i].length - 1] + ")");
		}
		// TODO 2: Comprueba si TODAS las filas y columnas tienen
		// exactamente la misma suma.
		boolean perfecta = true;
		
		// Como es matriz cuadrada ...
		int tam = matriz.length;

		int[] sumaFila = new int[tam];
		int[] sumaColumna = new int[tam];
		
		for (int i = 0; i < tam; i++) {
			for (int j = 0; j < tam; j++) {
				sumaFila[i] += matriz[i][j]; // fijo i y me muevo por j
				sumaColumna[i] += matriz[j][i]; // fijo i y me muevo por j
			}
		}
		
		System.out.println("---------------------------------------");
		// TODO 3: Muestra si se cumple la condición básica. Si se cumple,
		// muestra también el valor de la suma común.
		for (int i = 0; i < sumaFila.length; i++) {
			for (int j = sumaFila.length - 1; j > 0; j--) {
				if (!(sumaFila[i] == sumaFila[j] && sumaColumna[i] == sumaColumna[j]
						&& sumaColumna[i] == sumaFila[i])) {
					perfecta = false;
					break;
				}
			}
		}
		int suma = sumaFila[0];
		for (int i = 0; i < sumaFila.length; i++) {
			if(sumaFila[i] != suma ) perfecta = false; 
		}
		for (int i = 0; i < sumaColumna.length; i++) {
			if(sumaFila[i] != suma ) perfecta = false; 
		}
		
		if (perfecta) {
			System.out.println("La matriz cumple la condicion de filas y columnas");
			System.out.println("Suma comun: " + sumaFila[0]);
		} else {
			System.out.println("La matriz NO cumple la condicion de filas y columnas");
		}
		// TODO EXTRA (+0,5): Comprueba si ambas diagonales suman lo mismo
		// que las filas y columnas. Muestra el resultado de esta
		// comprobación ampliada POR SEPARADO del resultado básico.
		int[] sumaDiagonal = new int[2];
		for (int i = 0; i < matriz.length; i++) {
			sumaDiagonal[0] += matriz[i][i];

		}
		for (int i = 0, j = matriz.length - 1; j >= 0; j--, i++) {
			sumaDiagonal[1] += matriz[j][i];
		}
		System.out.println("---------------------------------------");
		System.out.println("Diagonal principal= " + sumaDiagonal[0]);
		System.out.println("Diagonal secundaria= " + sumaDiagonal[1]);
		if (perfecta && sumaFila[0] == sumaDiagonal[0]) {
			System.out.println("La diagonal principal coincide con las filas y columnas");

		}
		if (perfecta && sumaFila[0] == sumaDiagonal[1]) {
			System.out.println("La diagonal secundaria coincide con las filas y columnas");
		}
		if (perfecta && sumaFila[0] != sumaDiagonal[0] && sumaFila[0] != sumaDiagonal[1]) {
			System.out.println("La diagonales no coinciden.");
		}

	}
}
