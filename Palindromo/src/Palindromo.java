
import java.util.Scanner;

public class Palindromo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase:");
        String frase = sc.nextLine();
     // Se inicializa para que compile, pero podemos no inicializarla 
        boolean esPalindromo = true;
        //TODO: Conseguir que el valor de la variable esPalindromo sea true
        // si la palabra es un palíndromo y false en caso contrario. 
        
        
        

        if (esPalindromo) {
            System.out.println("Es palindromo");
        } else {
            System.out.println("No es palindromo");
        }
    }
}
