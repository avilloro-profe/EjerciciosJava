import java.util.Scanner;

/**
 * Realiza un programa que lea un número positivo N y calcule y visualice su
 * factorial N! Siendo el factorial: 0! = 1 1! = 1 2! = 2 * 1 3! = 3 * 2* 1 N! =
 * N * (N-1) * (N-2)........* 3*2*1
 */
public class Ejercicio5Bucles {

	public static void main(String[] args) {
		int num;
		Scanner teclado = new Scanner(System.in);

		// Forzar al usuario a introducir un número positivo
		do {
			System.out.println("Introduce un número entero y positivo");
			num = teclado.nextInt();
		} while (num < 0);

		// TODO: Calcular el factorial del número: do-while, while, for;

		teclado.close();
	}

}
