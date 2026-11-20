import java.util.Iterator;
import java.util.Scanner;

/**
 * Ejercicio 1. Análisis de una frase (3 puntos).
 *
 * <p>Escribe un programa que pida una frase al usuario y:</p>
 * <ol>
 *   <li>Divida la frase en palabras y las almacene en un array de String.</li>
 *   <li>Cree otro array con las palabras de longitud par, en el mismo orden.</li>
 *   <li>Muestre el total de palabras, el total de palabras de longitud par
 *       y la longitud media de todas las palabras.</li>
 *   <li>Cuente y muestre el número total de vocales de la frase.</li>
 *   <li>Muestre las palabras de longitud par, una por línea.</li>
 * </ol>
 *
 * <p>La frase contiene al menos una palabra, no tiene espacios iniciales
 * ni finales y hay exactamente un espacio entre palabras. Se cuentan
 * las vocales tanto en mayúsculas como en minúsculas. En el ejemplo,
 * las vocales con tilde también se consideran vocales.</p>
 *
 * <p>Ejemplo de ejecución:</p>
 * <pre>
 * Introduce una frase:
 * La programación requiere práctica y paciencia
 *
 * Total de palabras: 6
 * Palabras de longitud par: 4
 * Longitud media: 6.67
 * Numero total de vocales: 19
 *
 * Palabras de longitud par:
 * La
 * programación
 * requiere
 * práctica
 * </pre>
 *
 * <p>La media se calcula sobre todas las palabras. Se admite presentarla
 * con más decimales.</p>
 *
 * @author CPIFP Bajo Aragón - 0485 Programación
 */
public class Ejercicio1 {

    /**
     * Punto de entrada del ejercicio.
     *
     * @param args argumentos de consola (no se utilizan)
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una frase:");
        String frase = teclado.nextLine();
        String[] palabras;
        String[] palabrasPares;
        int contarPar = 0;
        int contarVocales = 0;
        int longitudTodas = 0;
        
        

        // TODO 1: Divide la frase y almacena todas las palabras en un String[].
        palabras = frase.split(" ");
        
     // TODO 2: crear string palabras longitud par
        // Cuento palabras
        for (int i = 0; i < palabras.length; i++) {
			if((palabras[i].length() %2) ==0 ) {
				contarPar++;
			}
		}
        palabrasPares = new String[contarPar];
        
        //Creo el string
        int indicePares = 0; 
        for (int i = 0; i < palabras.length; i++) {
			if((palabras[i].length() %2) ==0 ) {
				palabrasPares[indicePares] = palabras[i];
				indicePares++;
			}
		}
        
      
        // TODO 3: Calcula el total de palabras, el número de palabras
        //         de longitud par y la longitud media de TODAS las palabras.
        for (int i = 0; i < palabras.length; i++) {
        	longitudTodas += palabras[i].length();
		}
        

        // TODO 4: Cuenta las vocales de la frase (mayúsculas y minúsculas).
        //         Ten en cuenta las vocales acentuadas del ejemplo.
        for (int i = 0; i < frase.length(); i++) {
			if(frase.toUpperCase().charAt(i) == 'A' ||
					frase.toUpperCase().charAt(i) == 'E' ||
					frase.toUpperCase().charAt(i) == 'I' ||
					frase.toUpperCase().charAt(i) == 'O' ||
					frase.toUpperCase().charAt(i) == 'U' ||
					frase.toUpperCase().charAt(i) == 'Á' ||
					frase.toUpperCase().charAt(i) == 'É' ||
					frase.toUpperCase().charAt(i) == 'Í' ||
					frase.toUpperCase().charAt(i) == 'Ó' ||
					frase.toUpperCase().charAt(i) == 'Ú' ) {
				contarVocales++;
			}
				
		}
      
        
        // TODO 5: Muestra los resultados y, una por línea, las palabras
        //         de longitud par, siguiendo el ejemplo del enunciado.
        System.out.println("Total de palabras: " + palabras.length);
        System.out.println("Palabras de longitud par: " + palabrasPares.length);
        System.out.println("Longitud media: " + (((double)longitudTodas/palabras.length) ));
        System.out.println("Numero total de vocales: " + contarVocales);
        System.out.println("palabras de longitud par: ");
        for (int i = 0; i < palabrasPares.length; i++) {
			System.out.println(palabrasPares[i]);
		}
       
        
     
        
        teclado.close();
    }
}

