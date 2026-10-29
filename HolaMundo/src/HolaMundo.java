//importación automática con ctrl + may + o;

import java.util.Scanner;

/**
 * @author usuario
 * @version
 */
public class HolaMundo {
	public static void main(String[] args) {

		int numero;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime un número ");
		numero = teclado.nextInt();
		
//		System.out.println("Te quedan los siguientes días de la semana por trabjar");

		switch (numero) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
		System.out.println("Miercoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;

		default:
			System.out.println("Festivo");
			break;
		}

	}

}
