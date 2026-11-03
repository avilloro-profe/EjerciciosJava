
public class NumeroEscondido {
	public static void main(String[] args) {
		String frase = "El numero 22 está escondi2 aquí";
		String[] palabras = frase.split(" ");
		boolean esNumero = true; 
		int numero=0; 
		
		for (int i = 0; i < palabras.length; i++) {
			esNumero = true; 
			for (int j = 0; j < palabras[i].length(); j++) {
				if  (!(((int)palabras[i].charAt(j) >= (int) '0') && ((int)palabras[i].charAt(j) <= (int) '9'))) {
					esNumero = false; 
				}
			}
			if(esNumero) numero = Integer.parseInt(palabras[i]);
		}
 		System.out.println("El número es: " + numero);
	}

}
