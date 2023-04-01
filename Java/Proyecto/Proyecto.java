package Proyecto;

public class Proyecto {
    public static void main(String[] args) {

        /*
         * ? Incializando todas las clases
         */
        Logueo.inicializacionUsuarioLogueo();
        Empleados.inicializacionEmpleados();
        Clientes.inicializacionClientes();
        Provedores.instanciazionProvedor();
        Productos.inicializacionCarro();
        Productos.inicializacionServicio();
        Ventas.instanciarVentas();

        /* 
         * ? Iniciando el menu
         */
        Menu.solicitudCredenciales();
    }
}