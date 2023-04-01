package Proyecto;

import javax.swing.JOptionPane;

public class Proyecto {
    public static void main(String[] args) {
        Logueo.inicializacionUsuario();
        Empleados.inicializacionEmpleados();
        Clientes.inicializacionClientes();
        Provedores.instanciazionProvedor();
        Productos.inicializacionCarro();
        Productos.inicializacionServicio();
        Ventas.instanciarVentas();
        solicitudCredenciales();

    }

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
                String[] botonesLogueo = { "Agregar usuario", "Modificar usuario", "Eliminar usuario",
                        "Regresar al menu principal" };
                int decisionLogueo = JOptionPane.showOptionDialog(null, "¿A que sección de logueo deseas ir?",
                        "Menú logueo", 0,
                        JOptionPane.QUESTION_MESSAGE, null, botonesLogueo, "Logueo");

                switch (decisionLogueo) {
                    case 0:
                        Logueo.agregarUsuario(usuario, contrasenia);
                        break;

                    case 1:
                        Logueo.modificarUsuario();
                        break;

                    case 2:
                        Logueo.eliminarUsuario();
                        break;

                    case 3:
                        menuPrincipal(usuario, contrasenia);
                        break;

                    default:

                        break;
                }
                break;

            /*
             * ? Fin de funcionalidad de logueo
             */

            /*
             * ? Funcionalidad del menu de empleados
             */
            case 1:
                String[] botonesEmpleados = { "Mostrar empleados", "Agregar empleado", "Modificar empleado",
                        "Eliminar empleado", "Regresar al menu principal" };
                int decisionEmpleados = JOptionPane.showOptionDialog(null,
                        "¿A que sección de empleados deseas ir?",
                        "Menú empleados", 0,
                        JOptionPane.QUESTION_MESSAGE, null, botonesEmpleados, "Mostrar empleados");

                switch (decisionEmpleados) {
                    case 0:
                        Empleados.mostrarEmpleados();
                        break;

                    case 1:
                        Empleados.ingresarNuevoEmpleado(JOptionPane.showInputDialog(null, "Ingresa el nombre"),
                                JOptionPane.showInputDialog(null, "Ingresa el numero de cedula"),
                                Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el salario")),
                                JOptionPane.showInputDialog(null, "Ingrese el puesto"));
                        break;

                    case 2:
                        Empleados.modificarRegistro();
                        break;

                    case 3:
                        Empleados.eliminarEmpleado();
                        break;

                    case 4:
                        menuPrincipal(usuario, contrasenia);
                        break;

                    default:
                        break;
                }
                break;
            /*
             * ? Fin de funcionalidad empleados
             */

            /*
             * ? Funcionalidad del menu clientes
             */
            case 2:
                String[] botonesClientes = { "Mostrar clientes", "Agregar clientes", "Modificar clientes", "Regresar al menu principal"};
                int decisionClientes = JOptionPane.showOptionDialog(null,
                        "¿A que sección de clientes deseas ir?",
                        "Menú clientes", 0,
                        JOptionPane.QUESTION_MESSAGE, null, botonesClientes, "Mostrar clientes");

                switch (decisionClientes) {
                    case 0:
                        Clientes.mostrarCliente();
                        break;

                    case 1:
                        Clientes.registrarClientes();
                        break;

                    case 2:
                        Clientes.modificarCliente();
                        break;

                    case 3:
                        menuPrincipal(usuario, contrasenia);
                        break;

                    default:
                        break;
                }
                break;
            /*
             * ? Fin de funcionalidad clientes
             */

            /*
             * ? Funcionalidad del menu provedores
             */
            case 3:
                String[] botonesProvedor = { "Mostrar provedores", "Agregar provedor", "Modificar provedor",
                        "Eliminar provedor", "Regresar al menu principal" };
                int decisionProvedor = JOptionPane.showOptionDialog(null,
                        "¿A que sección de provedor deseas ir?",
                        "Menú provedor", 0,
                        JOptionPane.QUESTION_MESSAGE, null, botonesProvedor, "Mostrar provedores");

                switch (decisionProvedor) {
                    case 0:
                        Provedores.mostrarProvedor();
                        break;

                    case 1:
                        Provedores.agregarProvedor(JOptionPane.showInputDialog(null, "Ingresa provedor"));
                        break;

                    case 2:
                        Provedores.modificarProvedor();
                        break;

                    case 3:
                        Provedores.eliminarProvedor();
                        break;
                    
                    case 4:
                        menuPrincipal(usuario, contrasenia);
                        break;
                    default:
                        break;
                }
                break;
            /*
             * ? Fin de funcionalidad provedores
             */

            /*
             * ? Funcionalidad del menu producto
             */
            case 4:
                String[] botonesProductos = { "Inventario de vehiculos", "Agregar vehiculo", "Sacar vehiculo",
                        "Mostrar servicios", "Regresar al menu principal" };
                int decisionProductos = JOptionPane.showOptionDialog(null,
                        "¿A que sección de productos deseas ir?",
                        "Menú productos", 0,
                        JOptionPane.QUESTION_MESSAGE, null, botonesProductos, "Inventario de vehiculos");

                switch (decisionProductos) {
                    case 0:
                        Productos.mostrarInventarioCarro();
                        break;

                    case 1:
                        Productos.agregarVehiculo(
                                JOptionPane.showInputDialog(null, "Ingresa el Id"),
                                JOptionPane.showInputDialog(null, "Ingresa la marca"),
                                JOptionPane.showInputDialog(null, "Ingresa la decripcion"),
                                Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el precio")),
                                JOptionPane.showInputDialog(null, "Ingresa el estado del vehiculo"));
                        break;

                    case 2:
                        Productos.sacarVehiculo();
                        break;

                    case 3:
                        Productos.mostrarServicio();
                        break;

                    case 4:
                        menuPrincipal(usuario, contrasenia);
                        break;

                    default:
                        break;
                }
                break;
            /*
             * ? Fin de funcionalidad de productos
             */

            /*
             * ? Funcionalidad del menu de ventas
             */

            case 5:
                String[] botonesVentas = { "Consultar ventas", "Agregar venta",
                        "Modificar venta", "Eliminar venta", "Regresar al menu principal" };
                int decisionventas = JOptionPane.showOptionDialog(null,
                        "¿A que sección de ventas deseas ir?",
                        "Menú ventas", 0,
                        JOptionPane.QUESTION_MESSAGE, null, botonesVentas, "Consultar ventas");

                switch (decisionventas) {
                    case 0:
                        Ventas.consultarVenta();
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
                        break;

                    case 2:
                        Ventas.modificarRegistro();
                        break;

                    case 3:
                        Ventas.eliminarRegistro();
                        break;

                    case 4:
                        menuPrincipal(usuario, contrasenia);
                        break;

                    default:
                        break;
                }
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
}
