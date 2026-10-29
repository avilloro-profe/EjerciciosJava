import java.util.Arrays;

/**
 * Ejemplo para mostrar como utilizar correctamente la función
 * Arrays.copyOf() de java
 */
public class EjemploCopia {
	
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int[] b ;
		b = Arrays.copyOf(a,a.length);

		
		System.out.println("Valor de a: " + Arrays.toString(a));
		System.out.println("Valor de b: " + Arrays.toString(b));
	}

	

}
