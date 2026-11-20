import java.util.Iterator;
import java.util.Scanner;

/**
 * Ejercicio 4. Menor divisor propio (1,5 puntos).
 *
 * <p>Lee un número entero mayor que 1 y determina su menor divisor
 * positivo distinto de 1 y del propio número.</p>
 *
 * <p>Si el número no tiene divisores de ese tipo (es primo), muestra
 * un mensaje indicándolo. No es necesario gestionar entradas menores
 * o iguales que 1.</p>
 *
 * <p>Ejemplos de ejecución:</p>
 * <pre>
 * Introduce un numero: 91
 * Menor divisor propio: 7
 * </pre>
 * <pre>
 * Introduce un numero: 13
 * El numero no tiene divisores propios.
 * </pre>
 *
 * <p>Realiza toda la actividad en main, sin crear métodos propios.</p>
 *
 * @author CPIFP Bajo Aragón - 0485 Programación
 */
public class Ejercicio4 {

    /**
     * Lee el número y muestra el menor divisor propio, si existe.
     *
     * @param args argumentos de consola (no se utilizan)
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int numero = teclado.nextInt();
        int menorDivisor = -1; 
        boolean encontrado = false;

        // TODO 1: Determina si 'numero' tiene algún divisor positivo
        //         distinto de 1 y de sí mismo; en ese caso, encuentra
        //         el menor de esos divisores.
        
        for (int i = 2; i < numero  && !encontrado; i++) {
			if (numero %i == 0) {
				menorDivisor = i;
				encontrado = true; 
			}
		}
        
        

        // TODO 2: Muestra el menor divisor propio o indica que el número
        //         no tiene divisores propios, siguiendo los ejemplos.
        if(menorDivisor == -1) {
        	System.out.println("Primo");
        }else{
        	System.out.println("Menor divisor: " + menorDivisor);
        }
    }
}