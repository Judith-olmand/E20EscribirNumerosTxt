import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class E20LeerNumerosTxt {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("numeros.txt"))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo: " +
                    e.getMessage());
        }
    }
}
