package Proyecto;

import javax.swing.JOptionPane;

public class Menu {

    /*
     * ? Metodo para solicitud de credenciales
     */
    public static void solicitudCredenciales() {
        boolean continuamos = true;
        while (continuamos) {

            String usuario = JOptionPane.showInputDialog(null, "Ingrese el usuario");
            String contrasenia = JOptionPane.showInputDialog(null, "Ingrese la contraseña");

            if (Logueo.validacionLogueo(usuario, contrasenia)) {
                JOptionPane.showMessageDialog(null, "Bienvenido " + usuario);
                menuPrincipal(usuario, contrasenia);
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecto intente de nuevo");
            }

        }
    }

    /*
     * ? Metodo de menu principal
     */
    public static void menuPrincipal(String usuario, String contrasenia) {
        String[] botones = { "Logueo", "Empleados", "Clientes", "Provedores", "Productos", "Ventas",
                "Cambiar credenciales" };
        int decision = JOptionPane.showOptionDialog(null, "¿A que sección del programa deseas ir?", "Menú", 0,
                JOptionPane.QUESTION_MESSAGE, null, botones, "Logueo");

        /*
         * ? Funcionalidad del menu principal
         */
        switch (decision) {
            /*
             * ? Funcionalidad del menu del logueo
             */
            case 0:
                menuLogueo(usuario, contrasenia);
                break;

            /*
             * ? Fin de funcionalidad de logueo
             */

            /*
             * ? Funcionalidad del menu de empleados
             */
            case 1:
                menuEmpleados(usuario, contrasenia);

                break;
            /*
             * ? Fin de funcionalidad empleados
             */

            /*
             * ? Funcionalidad del menu clientes
             */
            case 2:
                menuClientes(usuario, contrasenia);
                break;
            /*
             * ? Fin de funcionalidad clientes
             */

            /*
             * ? Funcionalidad del menu provedores
             */
            case 3:
                menuProvedores(usuario, contrasenia);
                break;
            /*
             * ? Fin de funcionalidad provedores
             */

            /*
             * ? Funcionalidad del menu producto
             */
            case 4:
                menuProducto(usuario, contrasenia);
                break;
            /*
             * ? Fin de funcionalidad de productos
             */

            /*
             * ? Funcionalidad del menu de ventas
             */

            case 5:
                menuVentas(usuario, contrasenia);
                break;
            /*
             * ? Fin de funcionalidad de ventas
             */

            /*
             * ? Metodo para cambiar de usuario
             */
            case 6:
                solicitudCredenciales();
                break;

            default:
                break;
        }

    }

    /*
     * ? Metodo para desplegar el menu de logueo
     */
    public static void menuLogueo(String usuario, String contrasenia) {
        String[] botonesLogueo = { "Agregar usuario", "Modificar usuario", "Eliminar usuario",
                "Regresar al menu principal" };
        int decisionLogueo = JOptionPane.showOptionDialog(null, "¿A que sección de logueo deseas ir?",
                "Menú logueo", 0,
                JOptionPane.QUESTION_MESSAGE, null, botonesLogueo, "Logueo");

        switch (decisionLogueo) {
            case 0:

                Logueo.agregarUsuario(JOptionPane.showInputDialog(null, "Ingresar usuario"),
                        JOptionPane.showInputDialog(null, "Ingresa contraseña"));
                menuLogueo(usuario, contrasenia);
                break;

            case 1:
                Logueo.modificarUsuario();
                menuLogueo(usuario, contrasenia);
                break;

            case 2:
                Logueo.eliminarUsuario();
                menuLogueo(usuario, contrasenia);
                break;

            case 3:
                menuPrincipal(usuario, contrasenia);
                break;

            default:

                break;
        }
    }

    /*
     * ? Metodo de menu de empleados
     */
    public static void menuEmpleados(String usuario, String contrasenia) {
        String[] botonesEmpleados = { "Mostrar empleados", "Agregar empleado", "Modificar empleado",
                "Eliminar empleado", "Regresar al menu principal" };
        int decisionEmpleados = JOptionPane.showOptionDialog(null,
                "¿A que sección de empleados deseas ir?",
                "Menú empleados", 0,
                JOptionPane.QUESTION_MESSAGE, null, botonesEmpleados, "Mostrar empleados");

        switch (decisionEmpleados) {
            case 0:
                Empleados.mostrarEmpleados();
                menuEmpleados(usuario, contrasenia);
                break;

            case 1:
                Empleados.ingresarNuevoEmpleado(JOptionPane.showInputDialog(null, "Ingresa el nombre"),
                        JOptionPane.showInputDialog(null, "Ingresa el numero de cedula"),
                        Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el salario")),
                        JOptionPane.showInputDialog(null, "Ingrese el puesto"));
                        menuEmpleados(usuario, contrasenia);
                break;

            case 2:
                Empleados.modificarRegistro();
                menuEmpleados(usuario, contrasenia);
                break;

            case 3:
                Empleados.eliminarEmpleado();
                menuEmpleados(usuario, contrasenia);
                break;

            case 4:
                menuPrincipal(usuario, contrasenia);
                break;

            default:
                break;
        }
    }

    /*
     * ? Metodo de menu clientes
     */
    public static void menuClientes(String usuario, String contrasenia) {
        String[] botonesClientes = { "Mostrar clientes", "Agregar clientes", "Modificar clientes",
                "Regresar al menu principal" };
        int decisionClientes = JOptionPane.showOptionDialog(null,
                "¿A que sección de clientes deseas ir?",
                "Menú clientes", 0,
                JOptionPane.QUESTION_MESSAGE, null, botonesClientes, "Mostrar clientes");

        switch (decisionClientes) {
            case 0:
                Clientes.mostrarCliente();
                menuClientes(usuario, contrasenia);
                break;

            case 1:
                Clientes.registrarClientes();
                menuClientes(usuario, contrasenia);
                break;

            case 2:
                Clientes.modificarCliente();
                menuClientes(usuario, contrasenia);
                break;

            case 3:
                menuPrincipal(usuario, contrasenia);
                break;

            default:
                break;
        }
    }

    /*
     * ? Metodo de menu provedores
     */
    public static void menuProvedores(String usuario, String contrasenia) {
        String[] botonesProvedor = { "Mostrar provedores", "Agregar provedor", "Modificar provedor",
                "Eliminar provedor", "Regresar al menu principal" };
        int decisionProvedor = JOptionPane.showOptionDialog(null,
                "¿A que sección de provedor deseas ir?",
                "Menú provedor", 0,
                JOptionPane.QUESTION_MESSAGE, null, botonesProvedor, "Mostrar provedores");

        switch (decisionProvedor) {
            case 0:
                Provedores.mostrarProvedor();
                menuProvedores(usuario, contrasenia);
                break;

            case 1:
                Provedores.agregarProvedor(JOptionPane.showInputDialog(null, "Ingresa provedor"));
                menuProvedores(usuario, contrasenia);
                break;

            case 2:
                Provedores.modificarProvedor();
                menuProvedores(usuario, contrasenia);
                break;

            case 3:
                Provedores.eliminarProvedor();
                menuProvedores(usuario, contrasenia);
                break;

            case 4:
                menuPrincipal(usuario, contrasenia);
                break;
            default:
                break;
        }
    }

    /*
     * ? Metodo de menu producto
     */
    public static void menuProducto(String usuario, String contrasenia) {
        String[] botonesProductos = { "Inventario de vehiculos", "Agregar vehiculo", "Sacar vehiculo",
                "Mostrar servicios", "Regresar al menu principal" };
        int decisionProductos = JOptionPane.showOptionDialog(null,
                "¿A que sección de productos deseas ir?",
                "Menú productos", 0,
                JOptionPane.QUESTION_MESSAGE, null, botonesProductos, "Inventario de vehiculos");

        switch (decisionProductos) {
            case 0:
                Productos.mostrarInventarioCarro();
                menuProducto(usuario, contrasenia);
                break;

            case 1:
                Productos.agregarVehiculo(
                        JOptionPane.showInputDialog(null, "Ingresa el Id"),
                        JOptionPane.showInputDialog(null, "Ingresa la marca"),
                        JOptionPane.showInputDialog(null, "Ingresa la decripcion"),
                        Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el precio")),
                        JOptionPane.showInputDialog(null, "Ingresa el estado del vehiculo"));
                menuProducto(usuario, contrasenia);
                break;

            case 2:
                Productos.sacarVehiculo();
                menuProducto(usuario, contrasenia);
                break;

            case 3:
                Productos.mostrarServicio();
                menuProducto(usuario, contrasenia);
                break;

            case 4:
                menuPrincipal(usuario, contrasenia);
                break;

            default:
                break;
        }
    }

    /*
     * ? Metodo de menu de ventas
     */
    public static void menuVentas(String usuario, String contrasenia) {
        String[] botonesVentas = { "Consultar ventas", "Agregar venta",
                "Modificar venta", "Eliminar venta", "Regresar al menu principal" };
        int decisionventas = JOptionPane.showOptionDialog(null,
                "¿A que sección de ventas deseas ir?",
                "Menú ventas", 0,
                JOptionPane.QUESTION_MESSAGE, null, botonesVentas, "Consultar ventas");

        switch (decisionventas) {
            case 0:
                Ventas.consultarVenta();
                menuVentas(usuario, contrasenia);
                break;

            case 1:
                Ventas.agregarVenta(
                        JOptionPane.showInputDialog(null, "Ingresa el numero de venta"),
                        Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el monto")),
                        JOptionPane.showInputDialog(null, "Ingresa el producto"),
                        JOptionPane.showInputDialog(null, "Ingresa el metodo de pago"),
                        JOptionPane.showInputDialog(null, "Ingresa informacion del comprador"),
                        JOptionPane.showInputDialog(null, "Ingresa informacion del vendedor"),
                        JOptionPane.showInputDialog(null, "Ingresa la fecha de compra"));
                menuVentas(usuario, contrasenia);
                break;

            case 2:
                Ventas.modificarRegistro();
                menuVentas(usuario, contrasenia);
                break;

            case 3:
                Ventas.eliminarRegistro();
                menuVentas(usuario, contrasenia);
                break;

            case 4:
                menuPrincipal(usuario, contrasenia);
                break;

            default:
                break;
        }
    }
}