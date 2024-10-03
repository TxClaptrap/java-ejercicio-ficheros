import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvIgnore;

public class Alumno {
    @CsvBindByName(column= "nombreAlumno")
    private String nombre;
    @CsvBindByName(column= "edadAlumno")
    private int edad;
    @CsvIgnore
    private int campoNoNecesario;

    public Alumno(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
