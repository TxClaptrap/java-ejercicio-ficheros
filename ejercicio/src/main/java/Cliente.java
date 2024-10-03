import com.opencsv.bean.CsvBindByName;

public class Cliente {
    @CsvBindByName
    private String id;

    @CsvBindByName
    private String nombreCompleto;

    @CsvBindByName
    private String dni;

    @CsvBindByName
    private String email;

    @CsvBindByName
    private String telefono;

    public Cliente(String id, String nombreCompleto, String dni, String email, String telefono) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.email = email;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente [id=" + id + ", NombreCompleto=" + nombreCompleto + ", dni=" + dni + ", email=" + email
                + ", telefono=" + telefono + "]";
    }

    public String getId() {
        return id;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getDni() {
        return dni;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }
}
