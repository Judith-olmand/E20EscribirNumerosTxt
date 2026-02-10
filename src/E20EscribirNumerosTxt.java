import java.util.ArrayList;
import java.util.List;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class E20EscribirNumerosTxt  {
	public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<Integer>();

        for (int n = 1; n <= 10; n++) {
            numeros.add(n);
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("numeros.txt"))) {
            for (int num : numeros) {
                writer.write(num + "\r");
            }

            System.out.println("Líneas escritas en el archivo.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir en el archivo: " +
                    e.getMessage());
        }
    }
}