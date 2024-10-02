public class Cliente {
    private String id;
    private String NombreCompleto;
    private String dni;
    private String email;
    private String telefono;

    public Cliente(String id, String nombreCompleto, String dni, String email, String telefono) {
        this.id = id;
        NombreCompleto = nombreCompleto;
        this.dni = dni;
        this.email = email;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente [id=" + id + ", NombreCompleto=" + NombreCompleto + ", dni=" + dni + ", email=" + email
                + ", telefono=" + telefono + "]";
    }

    public String getId() {
        return id;
    }

    public String getNombreCompleto() {
        return NombreCompleto;
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
