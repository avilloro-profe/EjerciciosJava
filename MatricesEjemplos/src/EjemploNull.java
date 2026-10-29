
public class EjemploNull {
	public static void main(String[] args) {
		int[] v = {1,2,3,4};
		int[] w = {1,2,3,4};
		
		v = null;
		
		System.out.println(v == w);
	}

}
