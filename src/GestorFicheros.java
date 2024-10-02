
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class GestorFicheros {

    public List<Cliente> leerClientes(File clientes) throws IOException {
        try (Stream<String> lineas = Files.lines(Path.of("clientes.txt"))) {
            return lineas.map(linea -> ClienteFromList(linea)).filter(cliente -> cliente.getTelefono().startsWith("+34")).toList();     
        } 
}

    public Cliente ClienteFromList(String linea) {
        String[] arrayCliente = linea.split(",");
        ArrayList<String> lista = new ArrayList<>(Arrays.asList(arrayCliente));

        if (arrayCliente.length != 5) throw new IllegalArgumentException("Debe de haber 5 partes");

        if (lista.stream().anyMatch(parte -> parte.isEmpty())) throw new IllegalArgumentException("No puede haber partes vacías");

        if (!lista.get(0).matches("[0-9]+")) throw new IllegalArgumentException("El, id tiene que ser un número.");

        return new Cliente(arrayCliente[0], arrayCliente[1], arrayCliente[2], arrayCliente[3].toLowerCase(), arrayCliente[4]);
    }


    public File exportarClientes(List<Cliente> listaClientes) {
        
    }


}
