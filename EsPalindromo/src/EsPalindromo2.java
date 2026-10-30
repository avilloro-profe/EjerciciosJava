/**
 * Ejercicio que determina si una frase introducida por el
 * usuario es un palíndromo fonético
 * Solución hecha utilizando métodos de la clase StringBuilder
 * y de la clase String, aunque es preferible solucionar el problema
 * iterando sobre las palabras
 */
public class EsPalindromo2 {
	public static void main(String[] args) {
		String frase = "Dabale arroz a la zorra el Abad".replaceAll(" ",""); 
		String alReves = new StringBuilder(frase).reverse().toString().replaceAll(" ","");
		
		if(frase.compareToIgnoreCase(alReves)==0) {
			System.out.println("Es palíndromo");
		}else {
			System.out.println("no es palíndromo");
		}
		
		
	}

}
