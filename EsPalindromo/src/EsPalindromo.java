/**
 * Ejercicio que determina si una frase introducida por el
 * usuario es un palíndromo fonético
 * Solución hecha utilizando métodos de la clase StringBuilder
 * y de la clase String, aunque es preferible solucionar el problema
 * iterando sobre las palabras
 */
public class EsPalindromo {
	public static void main(String[] args) {
		String frase = "Dabale arroz a la zorra el abad".replaceAll(" ","").toUpperCase(); 
		boolean esPalindromo = true;  
		
		for (int i = 0; i < frase.length()/2; i++) {
			if(frase.charAt(i) != frase.charAt(frase.length()-1-i)) {
				esPalindromo = false; 
			}
		}
		
		if(esPalindromo) {
			System.out.println("Es palíndromo");
		}else {
			System.out.println("No es palíndromo");
		}
	}

}
