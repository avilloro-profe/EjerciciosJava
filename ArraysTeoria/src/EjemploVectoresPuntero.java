import java.util.Arrays;

public class EjemploVectoresPuntero {
	public static void main(String[] args) {
		int[] v = {1,2,3,4,5,6};
		int[] w = {10,20,30,40,50};
		
		v = w; // El vector v apunta a la misma direcci´no de la memoria que w
		v[2] = 7;
		w[3] = 99;
		
		System.out.println(Arrays.toString(v));
		System.out.println(Arrays.toString(w));
		
		int a = 5, b = 6;
		a = b; // La variable a toma el valor de la variable b
		a = 7;
		System.out.println("\nValor de a: " + a + ", valor de b: " + b);
		
		
	}

}
