
import java.util.Arrays;

public class EjerStrings {

    public static void main(String[] args) {

        // ============================================
        // 1. ARRAYS DE CHAR FRENTE A STRING
        // ============================================
    	System.out.println(" 1. ARRAYS DE CHAR FRENTE A STRING");

        char[] nombre1 = {'a','n','t','o','n','i','o'};
        String nombre2 = "antonio";

        // Ambos representan el mismo texto,
        // pero son tipos diferentes.

        // System.out.println(nombre1 == nombre2);
        // ERROR: no se pueden comparar con ==

        // Podemos comparar sus contenidos convirtiendo tipos.
        System.out.println(new String(nombre1).equals(nombre2)); // true
        System.out.println(Arrays.equals(nombre1, nombre2.toCharArray())); // true


        // ============================================
        // 2. SOBRECARGA DE println()
        // ============================================
        System.out.println("2. SOBRECARGA DE println()");

        // println(char[]) imprime los caracteres.
        System.out.println(nombre1); // antonio

        // println(Object) utiliza toString().
        System.out.println((Object) nombre1); // [C@... 

        // Los arrays no sobrescriben toString().
        System.out.println(nombre1.toString()); // [C@...

        // [C@... NO es una dirección de memoria,
        // sino una representación basada en el hashCode.


        // ============================================
        // 3. COMPARACIÓN: == FRENTE A equals()
        // ============================================
        System.out.println("3. COMPARACIÓN: == FRENTE A equals()");


        String a = "antonio";
        String b = "antonio";
        String c = new String("antonio");

        // == compara referencias (identidad).
        System.out.println(a == b); // true
        System.out.println(a == c); // false

        // equals() compara el contenido.
        System.out.println(a.equals(b)); // true
        System.out.println(a.equals(c)); // true


        // ============================================
        // 4. STRING POOL
        // ============================================

        System.out.println("4. STRING POOL");
        // Los literales iguales comparten objeto.
        String x = "hola";
        String y = "hola";

        System.out.println(x == y); // true

        // new String() crea un objeto nuevo.
        String z = new String("hola");

        System.out.println(x == z); // false

        // intern() devuelve la referencia canonica
        // del String Pool.
        String w = z.intern();

        System.out.println(x == w); // true


        // ============================================
        // 5. CONCATENACIÓN Y STRING POOL
        // ============================================

        System.out.println("5. CONCATENACIÓN Y STRING POOL");
        // El compilador une los literales constantes.
        String texto1 = "anto" + "nio";
        String texto2 = "antonio";

        System.out.println(texto1 == texto2); // true

        // Con una variable, la concatenación se
        // realiza en tiempo de ejecución.
        String parte = "anto";
        String texto3 = parte + "nio";

        System.out.println(texto3 == texto2); // false
        System.out.println(texto3.equals(texto2)); // true


        // ============================================
        // 6. charAt() Y ACCESO A CARACTERES
        // ============================================
        
        System.out.println("6. charAt() Y ACCESO A CARACTERES");
        char[] letras = {'a','n','t','o','n','i','o'};
        String nombre = "antonio";

        // En un array accedemos con [].
        System.out.println(letras[3]); // o

        // En String utilizamos charAt().
        System.out.println(nombre.charAt(3)); // o

        // Ojo: charAt() devuelve un char (unidad UTF-16).
        // No siempre equivale a un caracter Unicode completo.


        // ============================================
        // 7. MUTABILIDAD DE ARRAYS
        // ============================================
        
        System.out.println("7. MUTABILIDAD DE ARRAYS");

        char[] arrayA = {'a','n','t','o','n','i','o'};
        char[] arrayB = arrayA;

        // Ambos apuntan al MISMO array.
        System.out.println(arrayA == arrayB); // true

        // Modificamos el objeto original.
        arrayA[0] = 'A';

        System.out.println(arrayA); // Antonio
        System.out.println(arrayB); // Antonio


        // ============================================
        // 8. INMUTABILIDAD DE STRING
        // ============================================

        System.out.println("8. INMUTABILIDAD DE ARRAYS");
        
        String cadenaA = "antonio";
        String cadenaB = cadenaA;

        // Al principio apuntan al mismo objeto.
        System.out.println(cadenaA == cadenaB); // true

        // No existe setAt() ni setCharAt() en String.
        // cadenaA.setCharAt(0, 'A'); // ERROR

        // La concatenación crea otro String.
        cadenaA += "1";

        System.out.println(cadenaA); // antonio1
        System.out.println(cadenaB); // antonio

        // Ahora apuntan a objetos diferentes.
        System.out.println(cadenaA == cadenaB); // false


        // ============================================
        // 9. MODIFICAR UNA CADENA CON substring()
        // ============================================

        System.out.println("9. MODIFICAR UNA CADENA CON substring()");
        String original = "antonio";

        // Creamos una nueva cadena.
        original = "A" + original.substring(1);

        System.out.println(original); // Antonio


        // ============================================
        // 10. STRINGBUILDER: CADENAS MUTABLES
        // ============================================

        System.out.println(" 10. STRINGBUILDER: CADENAS MUTABLES");
        StringBuilder sb = new StringBuilder("antonio");
        StringBuilder otraReferencia = sb;

        // StringBuilder SI permite modificar caracteres.
        sb.setCharAt(0, 'A');

        System.out.println(sb);            // Antonio
        System.out.println(otraReferencia); // Antonio

        // Ambas referencias siguen apuntando al mismo objeto.
        System.out.println(sb == otraReferencia); // true

        // También permite añadir contenido sin crear
        // un nuevo StringBuilder.
        sb.append("1");

        System.out.println(sb); // Antonio1
    }
}
