import java.util.Scanner;

/**
 * Ejercicio; Dado un número entero, mostrar por pantalla el número de cifras que 
 * tiene. 
 * Ej: El usuario introduce 10008. -> El programa debe escribir: 
 * "El número tiene 5 cifras"
 */


public class ContarCifras {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int cifras=0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un número entero");
		num = teclado.nextInt();
		// TODO: Contamos cifras del número
		
		System.out.println("El número tiene " + cifras +" cifras");
		
		teclado.close();
	}
}
