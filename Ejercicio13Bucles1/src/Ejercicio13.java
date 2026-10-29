import java.util.Scanner;

/**
 * Realiza un programa donde el usuario "piensa" un número del 1 al 100 y el
	ordenador intenta adivinarlo. Es decir, el ordenador irá proponiendo números
	una y otra vez hasta adivinarlo (el usuario deberá indicarle al ordenador si 
	es mayor, menor o igual al número que ha pensado).
 */
public class Ejercicio13 {
	public static void main(String[] args) {
		int max=100, min = 0,adivinado, casos;
		Scanner teclado = new Scanner(System.in);
		
		
		do {
			adivinado = (max+min)/2;
			System.out.println("Es el numero " +adivinado +" mayor (1) , menor = (-1) igual(0)");
			casos = teclado.nextInt();
			if (casos == 1) max = adivinado;
			if (casos == -1) min = adivinado;
		}while(casos!=0);
		
		System.out.println("Estabas pensando en el número " + adivinado);
	}

}
