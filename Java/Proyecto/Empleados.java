package Proyecto;

import javax.swing.JOptionPane;

public class Empleados {
    private String nombre;
    private String cedula;
    private int salario = 0;
    private String puesto;

    static Empleados empleadosLista[] = new Empleados[10];

    /*
     * ? Encapsuladores
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

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(int puesto) {
        this.salario = puesto;
    }
    
    /*
     * ? Constructor vacio
     */
    public Empleados() {

    }

    /*
     * ? Constructor
     */
    public Empleados(String nombre, String cedula, int salario, String puesto) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.salario = salario;
        this.puesto = puesto;
    }

    /*
     * ? Inicializacion de usuarios
     */
    public static void inicializacionEmpleados() {
        empleadosLista[0] = new Empleados("Fran", "1", 100, "Gerente");
        empleadosLista[1] = new Empleados("Kevin", "12", 200, "Ingeniero");
        empleadosLista[2] = new Empleados("Alex", "123", 300, "Operario");

        for (int i = 3; i < empleadosLista.length; i++) {
            empleadosLista[i] = new Empleados();
        }
    }

    /*
     * ? Mostrar lista de empleados
     */
    public static void mostrarEmpleados() {
        String empleados = "";

        for (int i = 0; i < empleadosLista.length; i++) {

            if (i < empleadosLista.length - 1) {
                empleados += (i + 1) + ". " + empleadosLista[i].getNombre() + " \n";
            } else {
                empleados += (i + 1) + ". " + empleadosLista[i].getNombre();
            }
        }
        Logueo.mensaje(empleados);
    }

    /*
     * ? Metodo de modificacion de registro
     */
    public static void modificarRegistro() {
        Logueo.mensaje("Se mostrara la lista de usuario con la posicion podras modificar dicho usuario");
        listaEmpleados();
        int posicion = Integer
                .parseInt(JOptionPane.showInputDialog(null, "Digta la posicion del usuario que desea modificar"));

        String nombre = JOptionPane.showInputDialog(null, "Ingrese nombre");
        String cedula = JOptionPane.showInputDialog(null, "Ingrese cedula");
        int salario = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el nuevo salario"));
        String puesto = JOptionPane.showInputDialog(null, "Ingrese puesto");
        posicionEmpleados(posicion, nombre, cedula, salario, puesto);
        Logueo.mensaje("Se ha modificado el empleado exitosamente");
    }

    /* 
     * ? Metodo de eliminar usuario
     */
    public static void eliminarEmpleado() {
        Logueo.mensaje("Se mostrara la lista de usuario con la posicion podras eliminar dicho usuario");
        listaEmpleados();
        int posicion = Integer
                .parseInt(JOptionPane.showInputDialog(null, "Digta la posicion del usuario que desea eliminar"));

        empleadosLista[posicion - 1] = new Empleados();
        Logueo.mensaje("Se ha eliminado el usuario con exito");
    }

    /* 
     * ? Metodo para ingresar un nuevo empleado
     */
    public static void ingresarNuevoEmpleado(String nombre, String cedula, int salario, String puesto) {
        for (int i = 0; i < empleadosLista.length; i++) {

            if (empleadosLista[i].getNombre() == null) {
                empleadosLista[i] = new Empleados(nombre, cedula, salario, puesto);
                Logueo.mensaje("Usuario agregado exitosamente");
                break;
            } else if (empleadosLista[9].getNombre() != null) {
                Logueo.mensaje("Maximo de empleados agregados");
            }
        }
    }

    /* 
     * ? para mostra la lista de los empleados registrados
     */
    public static void listaEmpleados() {
        String usuarios = "";

        for (int i = 0; i < empleadosLista.length; i++) {

            if (i < empleadosLista.length - 1) {
                usuarios += (i + 1) + ". " + empleadosLista[i].getNombre() + " \n";
            } else {
                usuarios += (i + 1) + ". " + empleadosLista[i].getNombre();
            }
        }
        Logueo.mensaje(usuarios);
    }

    /*
     * ? Eligiendo la pocicion del empleado
     */
    public static void posicionEmpleados(int posicion, String nombre, String cedula, int salario, String puesto) {
        empleadosLista[posicion - 1].setNombre(nombre);
        empleadosLista[posicion - 1].setCedula(cedula);
        empleadosLista[posicion - 1].setSalario(salario);
        // empleadoslista[pocision - 1].setPuestos(puesto);
    }
}
