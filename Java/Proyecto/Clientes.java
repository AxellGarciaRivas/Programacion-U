package Proyecto;

public class Clientes {
    private String nombre;
    private String cedula;
    private String direccion;
    private String telefono;
    private String correo;

    public Clientes(String nombre, String cedula, String direccion, String telefono, String correo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public static void mostrarClientes() {
        
    }

    public static boolean modificarCliente() {
        boolean confirmacion = false;

        return confirmacion;
    }

    public static boolean agregarCliente() {
        boolean confirmacion = false;

        return confirmacion;
    }
}
