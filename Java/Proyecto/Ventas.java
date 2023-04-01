package Proyecto;

import javax.swing.JOptionPane;

public class Ventas {
    private String numeroVentas;
    private int monto;
    private String producto;
    private String metodoPago;
    private String infoComprador;
    private String infoVendedor;
    private String fechaVenta;
    static Ventas listaVentas[] = new Ventas[10];

    public String getNumeroVentas() {
        return numeroVentas;
    }

    public void setNumeroVentas(String numeroVentas) {
        this.numeroVentas = numeroVentas;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public String getInfoComprador() {
        return infoComprador;
    }

    public void setInfoComprador(String infoComprador) {
        this.infoComprador = infoComprador;
    }

    public String getInfoVendedor() {
        return infoVendedor;
    }

    public void setInfoVendedor(String infoVendedor) {
        this.infoVendedor = infoVendedor;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    /* 
     * ? Constructor vacio
     */
    public Ventas() {

    }
    
    /* 
     * ? Constructor
     */
    public Ventas(String numeroVentas, int monto, String producto, String metodoPago, String infoComprador,
            String infoVendedor, String fechaVenta) {
        this.numeroVentas = numeroVentas;
        this.monto = monto;
        this.producto = producto;
        this.metodoPago = metodoPago;
        this.infoComprador = infoComprador;
        this.infoVendedor = infoVendedor;
        this.fechaVenta = fechaVenta;
    }

    /* 
     * ? Instanciamiento de objetos
     */
    public static void instanciarVentas() {
        listaVentas[0] = new Ventas("1", 100, "Carro Hyundai", "Tarjeta", "Axell Garcia Rivas", "Juan Gonzales", "23/3/23");
        listaVentas[1] = new Ventas("2", 200, "Cambio aceite", "Tarjeta", "Kendall Villalobos", "Carlos Hernandez", "24/3/23");
        listaVentas[2] = new Ventas("3", 300, "Reparacion llanta", "Efectivo", "Nick Rodriguez", "Juan Salas", "24/3/23");
        listaVentas[3] = new Ventas("4", 400, "Mantenimiento preventivo", "Tarjeta", "Ana Rosales", "Michael Luna", "25/3/23");

        for (int i = 4; i < listaVentas.length; i++) {
            listaVentas[i] = new Ventas();
        }
    }

    /* 
     * ? Modificar registrosc
     */
    public static void modificarRegistro() {
        Logueo.mensaje("Se mostrara la lista de registro con la posicion podras modificar dicho registro");
        consultarVenta();
        int posicion = Integer.parseInt(JOptionPane.showInputDialog(null, "Digta la posicion del usuario que desea modificar"));

        int monto = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa monto"));
        String producto = JOptionPane.showInputDialog(null, "Ingrese producto");
        String metodoPago = JOptionPane.showInputDialog(null, "Ingrese metodo de pago");
        String infoComprador = JOptionPane.showInputDialog(null, "Ingrese Informacion del comprador");
        String fecha = JOptionPane.showInputDialog(null, "Ingrese fecha");
        Logueo.mensaje("Se ha modificado el empleado exitosamente");
        posicionFactura(posicion, monto, producto, metodoPago, infoComprador, fecha);
        consultarVenta();
    }

    /* 
     * ? Metodo para eliminar registro de facturas
     */
    public static void eliminarRegistro() {
        Logueo.mensaje("Se mostrara la lista de ventas con la posicion podras eliminar dicha venta");
        consultarVenta();
        int posicion = Integer.parseInt(JOptionPane.showInputDialog(null, "Digta la posicion de venta que desea eliminar"));

        listaVentas[posicion - 1] = new Ventas();
        Logueo.mensaje("Se ha eliminado la factura con exito");
    }

    /* 
     * ? Metodo para agregar facturas
     */
    public static void agregarVenta(String numeroVentas, int monto, String producto, String metodoPago, String infoComprador, String infoVendedor, String fechaVenta) {
        for (int i = 0; i < listaVentas.length; i++) {

            if (listaVentas[i].getInfoComprador() == null) {
                listaVentas[i] = new Ventas(numeroVentas, monto, producto, metodoPago, infoComprador, infoVendedor, fechaVenta);
                Logueo.mensaje("Factura agregada exitosamente");
                break;
            } else if (listaVentas[9].getInfoComprador() != null) {
                Logueo.mensaje("Maximo de facturas agregados");
            }
        }
    }

    /* 
     * ? Consul de ventas realizadas
     */
    public static void consultarVenta() {
        String numeroVenta = "";

        for (int i = 0; i < listaVentas.length; i++) {

            if (i < listaVentas.length - 1) {
                numeroVenta += (i + 1) + ". " + listaVentas[i].getInfoComprador() + " \n";
            } else {
                numeroVenta += (i + 1) + ". " + listaVentas[i].getInfoComprador();
            }
        }
        Logueo.mensaje(numeroVenta);
    }

    /* 
     * ? Posicion de factura a modificar
     */
    public static void posicionFactura(int posicion, int monto, String producto, String metodoPago, String infoComprador, String fecha) {
        listaVentas[posicion - 1].setMonto(monto);
        listaVentas[posicion - 1].setProducto(producto);
        listaVentas[posicion - 1].setMetodoPago(metodoPago);
        listaVentas[posicion - 1].setInfoComprador(infoComprador);
        listaVentas[posicion - 1].setFechaVenta(fecha);
    }
}