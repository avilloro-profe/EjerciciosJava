import java.util.Scanner;

public class EjemploIteraciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("introduce número: ");
		Scanner teclado = new Scanner(System.in);
		n = teclado.nextInt();
		
		for(int i = 2;i <=n;i++) {
			System.out.println(i);
			if(i%2 == 0) {
				System.out.println(i);
			}
		}

		teclado.close();
	}

}
