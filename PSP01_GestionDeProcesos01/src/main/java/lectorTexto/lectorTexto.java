package lectorTexto;
import java.io.*;

/**
 * Aplicación lectorTexto
 * Esta aplicación lee el contenido de un archivo de texto línea a línea
 * y lo muestra en la salida estándar.
 */

public class lectorTexto {
    public static void main(String[] args) {

        // Bloque try-with-resources: garantiza que el BufferedReader se cierre automáticamente
        try (InputStream is = lectorTexto.class.getResourceAsStream("/entrada.txt");
             BufferedReader br = new BufferedReader(new InputStreamReader(is))) {

            // Variable para almacenar cada línea leída
            String linea;

            // Bucle que se ejecuta mientras haya líneas en el archivo
            while ((linea = br.readLine()) != null) {
                // Imprime la línea actual en consola
                System.out.println(linea);
            }

        // Captura de excepciones relacionadas con la lectura del archivo
        } catch (IOException e) {
            // Mensaje de error si no se pudo acceder al archivo
            System.err.println("Error: No se pudo leer el archivo.");
            System.err.println("Asegúrate de que el archivo existe en el directorio actual.");

            // Finaliza el programa con un código de error
            System.exit(1);
        }
    }
}
