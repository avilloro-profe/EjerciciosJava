import java.util.Scanner;

public class AnioBisiesto {
	// Ejercicio: Determinar si un año es bisiesto
	public static void main(String[] args) {
		int anio;
		boolean esMultiplo4, esMultiplo100, esMultiplo400, esBisiesto;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime un año ");
		anio = teclado.nextInt();
		
		esMultiplo4 = (anio %4 == 0);
		esMultiplo100 = (anio %100 == 0);
		esMultiplo400 = (anio %400 == 0);
		esBisiesto = ((esMultiplo4 && !esMultiplo100) || esMultiplo400);

			
		if (esBisiesto) {
			System.out.println("El año " + anio + "es bisiesto");
		} else {
			System.out.println("El año " + anio + "no es bisiesto");
		}
		
		
		
	}

}
