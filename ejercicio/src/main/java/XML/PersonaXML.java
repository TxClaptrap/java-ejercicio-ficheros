package XML;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement // Raíz del documento XML
public class PersonaXML {
    private String nombre;
    private int edad;

    // Constructor sin argumentos necesario para JAXB
    public PersonaXML() {
    }

    public PersonaXML(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @XmlElement // Elemento XML
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @XmlAttribute
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
