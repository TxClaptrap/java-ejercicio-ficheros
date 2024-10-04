import java.io.IOException;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PruebaClientes {

    public static void main(String[] args) {
        GestorFicheros gestorFicheros = new GestorFicheros();

        try {
            List<Cliente> clientes = gestorFicheros.leerClientes();
            
            System.out.println("Clientes leídos:");
            for (Cliente cliente : clientes) {
                System.out.println(cliente);
            }

            gestorFicheros.crearCSV(clientes);



            System.out.println("Clientes exportados a 'solucion.txt'");

        } catch (IOException e) {
            System.err.println("Error de E/S: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.err.println("Error en los datos: " + e.getMessage());
        }
    }
}
