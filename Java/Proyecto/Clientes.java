package Proyecto;

import javax.swing.JOptionPane;

public class Clientes {
    private String nombre;
    private String cedula;
    private String direccion;
    private String telefono;
    private String correo;
    static Clientes clientesarr[] = new Clientes[30];

    /* 
     * ? Constructor
     */
    public Clientes(String nombre, String cedula, String direccion, String telefono, String correo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
    }

    /* 
     * ? Encapsuladores de los atributos
     */
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

    /* 
     * ? Constructor vacio
     */
    public Clientes() {
    }

    /* 
     * ? Metodo para inicializacion de los clientes
     */
    public static void inicializacionClientes() {
        clientesarr[0] = new Clientes("FAFA JIMINEZ", "111", "CONCEPCION", "898989000", "fafa@gmail.com");
        clientesarr[1] = new Clientes("PAO JIMENEZ", "222", "CONCEPCION", "87609034", "poa@gmail.com");

        for (int i = 2; i < clientesarr.length; i++) {
            clientesarr[i] = new Clientes();
        }
    }
    /* 
     * ? Metodo para registrar cliente
     */
    public static void registrarClientes() {
        for (int i = 0; i < clientesarr.length; i++) {
            if (clientesarr[i].getNombre() == null) {
            String nomCliente = JOptionPane.showInputDialog("Digite el nombre del cliente").toUpperCase();
            String idCliente = JOptionPane.showInputDialog("Digite la cécula del cliente").toUpperCase();
            String direcCliente = JOptionPane.showInputDialog("Digite el dirección del cliente").toUpperCase();
            String telefCliente = JOptionPane.showInputDialog("Digite el teléfono del cliente");
            String emailCliente = JOptionPane.showInputDialog("Digite el email del cliente");
            // Ya tengo los atributos para crear el objeto, entonces puedo instanciar en el
            // arreglo
                clientesarr[i] = new Clientes(nomCliente, idCliente, direcCliente, telefCliente, emailCliente);
                Logueo.mensaje("Cliente agregado exitosamente");
                break;
            } else if (clientesarr[9].getNombre() != null) {
                Logueo.mensaje("Maximo de clientes agregados");
            }

        } // Fin del else
    }// Fin del método

    /* 
     * ? Metodo para mostrar lista de clientes
     */
    public static void mostrarCliente() {
        String clientes = "";

        for (int i = 0; i < clientesarr.length; i++) {

            if (i < clientesarr.length - 1) {
                clientes += (i + 1) + ". " + clientesarr[i].getNombre() + " \n";
            } else {
                clientes += (i + 1) + ". " + clientesarr[i].getNombre();
            }
        }
        Logueo.mensaje(clientes);
    }

    /* 
     * ? Metodo para modificar cliente
     */
    public static void modificarCliente() {
        JOptionPane.showMessageDialog(null,
                "Se mostrara la lista de clientes con la posicion podras modificar dicho clientes");
        mostrarCliente();
        int posicion = Integer
                .parseInt(JOptionPane.showInputDialog(null, "Digita la posicion del cliente que desea modificar"));

        String nombre = JOptionPane.showInputDialog(null, "Ingrese el nuevo nombre");
        String cedula = JOptionPane.showInputDialog(null, "Ingrese la nueva cedula");
        String direccion = JOptionPane.showInputDialog(null, "Ingrese la nueva direccion");
        String telefono = JOptionPane.showInputDialog(null, "Ingrese el nuevo telefono");
        String email = JOptionPane.showInputDialog(null, "Ingrese el nuevo email");

        posicionCliente(posicion, nombre, cedula, direccion, telefono, email);
        JOptionPane.showMessageDialog(null, "Se ha modificado el cliente exitosamente");
    }

    /* 
     * ? Metodo para posicion
     */
    public static void posicionCliente(int posicion, String nombre, String cedula, String direccion, String telefono,
            String email) {
        clientesarr[posicion - 1].setNombre(nombre);
        clientesarr[posicion - 1].setCedula(cedula);
        clientesarr[posicion - 1].setDireccion(direccion);
        clientesarr[posicion - 1].setTelefono(telefono);
        clientesarr[posicion - 1].setCorreo(email);
    }

}
