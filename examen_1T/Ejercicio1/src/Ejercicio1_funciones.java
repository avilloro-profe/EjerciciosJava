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
public class Ejercicio1_funciones {
	
	
	
	//TODO: Crear  las funciones divideEnPalabras, creaPares
	// calculaMedia, cuentaVocales

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
        double media; 
        
        

        // TODO 1: Crea una función que divide la frase y almacena todas las palabras en un String[].
        palabras = divideEnPalabras(frase);
        
     // TODO 2: Crea una funcioón que devuelva un array de strings palabras longitud par
        // Cuento palabras
        
        palabrasPares = creaPares(palabras);
        
        
        
      
        // TODO 3:Función que calcula la media del valor de las palabras
        media = calculaMedia(palabras);
        

        // TODO 4: Cuenta las vocales de la frase (mayúsculas y minúsculas).
        //         Ten en cuenta las vocales acentuadas del ejemplo.
        contarVocales = cuentaVocales(frase);
      
        
        // TODO 5: Muestra los resultados y, una por línea, las palabras
        //         de longitud par, siguiendo el ejemplo del enunciado.
        System.out.println("Total de palabras: " + palabras.length);
        System.out.println("Palabras de longitud par: " + palabrasPares.length);
        System.out.println("Longitud media: " + media;
        System.out.println("Numero total de vocales: " + contarVocales);
        System.out.println("palabras de longitud par: ");
        for (int i = 0; i < palabrasPares.length; i++) {
			System.out.println(palabrasPares[i]);
		}
       
        
     
        
        teclado.close();
    }
}

