import java.io.IOException;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MainExportTxt {

    public static void main(String[] args) {
        GestorFicheros gestorFicheros = new GestorFicheros();

        try {
            // Leer los clientes desde el archivo "clientes.txt"
            List<Cliente> clientes = gestorFicheros.leerClientes();
            
            // Mostrar los clientes leídos
            System.out.println("Clientes leídos:");
            for (Cliente cliente : clientes) {
                System.out.println(cliente);
            }

            // Exportar los clientes filtrados al archivo "solucion.txt"
            gestorFicheros.exportarClientes(clientes);

            System.out.println("Clientes exportados exitosamente a 'solucion.txt'");

        } catch (IOException e) {
            System.err.println("Error de E/S: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.err.println("Error en los datos: " + e.getMessage());
        }
    }
}

