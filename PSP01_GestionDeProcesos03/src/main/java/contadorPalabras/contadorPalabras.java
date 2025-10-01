package contadorPalabras;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * Aplicación contadorPalabras
 * Esta aplicación lee texto desde la entrada estándar (teclado o tuberías en consola)
 * y cuenta el número total de palabras introducidas.
 * Se considera "palabra" cualquier secuencia de caracteres separada por espacios.
 */

public class contadorPalabras {
    public static void main(String[] args) {

        // Contador que almacenará el número total de palabras
        int totalPalabras = 0;

        // try-with-resources: asegura el cierre automático del BufferedReader
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            // Variable para almacenar cada línea leída
            String linea;

            // Leer línea a línea de la entrada estándar
            while ((linea = br.readLine()) != null) {

                // Eliminar espacios en blanco al inicio y final de la línea
                linea = linea.trim();

                // Si la línea no está vacía, se cuentan las palabras
                if (!linea.isEmpty()) {

                    // Dividir la línea en palabras usando uno o más espacios como separador
                    String[] palabras = linea.split("\\s+");

                    // Sumar el número de palabras encontradas en la línea al total
                    totalPalabras += palabras.length;
                }
            }

            // Mostrar en consola el total de palabras contadas
            System.out.println("Total de palabras: " + totalPalabras);

        // Captura de errores de entrada/salida
        } catch (IOException e) {
            System.err.println("Error al leer de la entrada estándar: " + e.getMessage());

            // Terminar el programa con código de error
            System.exit(1);
        }
    }
}
