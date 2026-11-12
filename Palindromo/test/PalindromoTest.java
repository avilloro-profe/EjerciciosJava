
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.*;
import java.nio.charset.StandardCharsets;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class PalindromoTest {

    @ParameterizedTest(name = "{0} -> {1}")
    @CsvSource({
        "'ana', 'Es palindromo'",
        "'reconocer', 'Es palindromo'",
        "'Anita lava la tina', 'Es palindromo'",
        "'Somos o no somos', 'Es palindromo'",
        "'hola', 'No es palindromo'",
        "'casa', 'No es palindromo'",
        "'Java', 'No es palindromo'"
    })
    void probarPalindromo(String frase, String esperado)
            throws Exception {

        // Guardamos la entrada y salida originales
        InputStream entradaOriginal = System.in;
        PrintStream salidaOriginal = System.out;

        try {
            // Simulamos lo que escribe el usuario
            System.setIn(new ByteArrayInputStream(
                (frase + "\n").getBytes(StandardCharsets.UTF_8)
            ));

            // Preparamos la captura de pantalla
            ByteArrayOutputStream buffer =
                    new ByteArrayOutputStream();

            System.setOut(new PrintStream(
                buffer, true, StandardCharsets.UTF_8
            ));

            // Ejecutamos el programa original
            Palindromo.main(new String[]{});

            // Recuperamos lo que se ha mostrado
            String resultado =
                buffer.toString(StandardCharsets.UTF_8);

            // Comprobamos la salida exacta
            String salidaEsperada =
                "Introduce una frase:" + System.lineSeparator()
                + esperado + System.lineSeparator();

            assertEquals(salidaEsperada, resultado);

        } finally {
            // Restauramos la consola
            System.setIn(entradaOriginal);
            System.setOut(salidaOriginal);
        }
    }
}
