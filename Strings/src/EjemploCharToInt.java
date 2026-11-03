import java.util.Scanner;

public class EjemploCharToInt {
	public static void main(String[] args) {
		System.out.println((char) 100);
		System.out.println((int)'a');
		char caracter;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un caracter: ");
		caracter = teclado.nextLine().charAt(0);
		//¿Cómo se si un caracter es una letra minúscula?
		// P. ej con letras minúsculas la letra a tiene el valor 97 y la z el valor 122
		if((int)caracter >=(int)'a' && (int)caracter <= (int)'z') {
			//Sé que la letra es minúscula. Voy a convertirla a mayúsculas
			System.out.println("La letra mayúscula de " + caracter + " es: "
					+ (char)((int)caracter - ((int)'a' - (int) 'A')));
		}

		
		
		
		
		teclado.close();
	}

}
