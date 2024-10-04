import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvValidationException;

public class MainReaderCSV {
    public static void main(String[] args) throws CsvValidationException {
        try (Reader reader = Files.newBufferedReader(Path.of("prueba.csv"));
             CSVReader csvReader = new CSVReaderBuilder(reader)
                    .withSkipLines(1) // procesar a partir de la segunda línea
                    .withCSVParser(new CSVParserBuilder().build())
                    .build()) {

            String[] linea;
            while ((linea = csvReader.readNext()) != null) {
                for (String columna : linea) {
                    System.out.println("Columna: " + columna);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
