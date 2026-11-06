import java.util.Iterator;
import java.util.Scanner;

/**
 * Determinar si un String introducido por el usuario es un DNI válido
 * 
 * Para que sea válido debe cumplir lo siguiente: 
 *  - Debe tener longitud 9
 *  - Los primeros 8 caracteres deben ser cifras enteras
 *  - El último caracter debe ser una letra
 *  - Se debe cumplir la regla del DNI, es decir: 
 *  	Al tomar el número del DNI, el resultado de obtener el módulo 23
 *  	del número debe asociarse a la siguiente tabla: 
 *  	0: T | 1: R | 2: W | 3: A | 4: G | 5: M | 6: Y | 7: F | 8: P | 9: D 
 *  	| 10: X | 11: B | 12: N | 13: J | 14: Z | 15: S | 16: Q | 17: V | 18: H 
 *  	| 19: L | 20: C | 21: K | 22: E
 *  	
 */
public class EjercicioDNI_guiado {
	public static void main(String[] args) {
		final String LETRAS_DNI = "TRWAGMYFPDXBNJZSQVHLCKE"; 
		String dni; 
		boolean esValido;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce dni");
		dni = teclado.nextLine().toUpperCase();
		//TODO: Determinar si el dni es válido
		esValido = dni.length() == 9;
		for (int i = 0; i < dni.length()-1; i++) {
			esValido = esValido && ((int)dni.charAt(i) <= (int) '9' 
					&& (int)dni.charAt(i) >= (int) '0');
		}
		
		if(esValido) {
			esValido = (dni.charAt(dni.length()-1) == 
						LETRAS_DNI.charAt((Integer.parseInt(dni.substring(0, 8)) % 23)));
		}
		
		esValido = esValido && ((int) dni.charAt(dni.length()-1) <= 'Z'
				&& (int) dni.charAt(dni.length()-1) >= 'A');
				
		System.out.println(esValido);
		
		
		teclado.close();
	}

}
