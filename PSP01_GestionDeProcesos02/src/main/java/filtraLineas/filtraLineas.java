package filtraLineas;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * Aplicación filtraLineas
 * Esta aplicación lee texto desde la entrada estándar (teclado o tuberías en consola)
 * y muestra únicamente aquellas líneas que tienen más de 20 caracteres.
 */

public class filtraLineas {
    public static void main(String[] args) {

        // try-with-resources para garantizar el cierre automático del BufferedReader
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);

            // Variable para guardar cada línea leída
            String linea;

            // Bucle que se ejecuta mientras haya texto en la entrada estándar
            while ((linea = br.readLine()) != null) {

                // Comprueba si la línea tiene más de 20 caracteres
                if (linea.length() > 20) {

                    // Si cumple la condición, se imprime en la consola
                    System.out.println(linea);
                }
            }

        // Manejo de excepciones si ocurre un error al leer de la entrada estándar
        } catch (IOException e) {
            System.err.println("Error al leer de la entrada estandar: " + e.getMessage());

            // Finaliza el programa con un código de error
            System.exit(1);
        }
    }
}
