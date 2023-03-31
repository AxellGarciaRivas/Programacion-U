package Proyecto;

import javax.swing.JOptionPane;

public class Productos {
    private String id;
    private String marca;
    private estado estado;
    private String descripcion;
    private int precio;
    static Productos listaCarro[] = new Productos[10];
    static Productos listaServicios[] = new Productos[5];

    /*
     * ? Encapsuladores de los atributos carro
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public estado getEstado() {
        return estado;
    }

    public void setEstado(estado estado) {
        this.estado = estado;
    }

    public enum estado {
        Nuevo,
        Usado
    }

    /*
     * ? Constructor vacio
     */
    public Productos() {
    }

    /*
     * ? Constructor
     */
    public Productos(String id, String marca, int estado, String descripcion, int precio) {
        this.id = id;
        this.marca = marca;
        // this.estado = estado;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    /* 
     * ? Metodo de inicializacion del objeto
     */
    public static void inicializacionCarro() {
        listaCarro[0] = new Productos("1", "Hyundai", 0, "Carro de cochera", 100);
        listaCarro[1] = new Productos("2", "Toyota", 0, "Carro muy cuidado", 200);
        listaCarro[2] = new Productos("3", "Toyota", 0, "Carro muy cuidado", 300);
        listaCarro[3] = new Productos("4", "Toyota", 0, "Carro muy cuidado", 400);
        listaCarro[4] = new Productos("5", "Toyota", 0, "Carro muy cuidado", 500);

        for (int i = 5; i < listaCarro.length; i++) {
            listaCarro[i] = new Productos();
        }
    }

    /*
     * ? Mostar inventario de carros
     */
    public static void mostrarInventarioCarro() {
        String carros = "";
        for (int i = 0; i < listaCarro.length; i++) {

            if (i < listaCarro.length - 1) {
                carros += (i + 1) + ". " + listaCarro[i].getMarca() + " \n";
            } else {
                carros += (i + 1) + ". " + listaCarro[i].getMarca();
            }
        }
        Logueo.mensaje(carros);
    }

    /* 
     * ? metodo para sacar vehiculo de inventario
     */
    public static void sacarVehiculo() {
        Logueo.mensaje("Se mostrara la lista de carros con la posicion podras sacar dicho vehiculo del inventario");
        mostrarInventarioCarro();
        int posicion = Integer.parseInt(JOptionPane.showInputDialog(null, "Digta la posicion del usuario que desea eliminar"));

        listaCarro[posicion - 1] = new Productos();
        Logueo.mensaje("Se ha sacado de inventario el carro con exito");
        mostrarInventarioCarro();
    }

    /* 
     * ? Metodo para agregar vehiculos
     */
    public static void agregarVehiculo(String id, String marca, int estado, String descripcion, int precio) {
        for (int i = 0; i < listaCarro.length; i++) {

            if (listaCarro[i].getMarca() == null) {
                listaCarro[i] = new Productos(id, marca, estado, descripcion, precio);
                Logueo.mensaje("Carro agregado exitosamente");
                break;
            } else if (listaCarro[14] != null) {
                Logueo.mensaje("Maximo de carros agregados");
            }
        }
    }


    /* 
     * ? Servicios
     */
    private String servicio;
    private int precioServicio;

    /* 
     * ? Encapsuladores de atributos servicios
     */
    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public int getPrecioServicio() {
        return precioServicio;
    }

    public void setPrecioServicio(int precioServicio) {
        this.precioServicio = precioServicio;
    }


     /* 
      * ? Constructor de servicios
      */
    public Productos(String servicio, int precioServicio) {
        this.servicio = servicio;
        this.precioServicio = precioServicio;
    }

    /* 
     * ? inicializando los servicios
     */
    public static void mostrarInventarioServicio() {
        listaServicios[0] = new Productos("Cambio de aceite", 100);
        listaServicios[1] = new Productos("Venta", 10000);
        listaServicios[2] = new Productos("Lavado de vehiculos", 2000);
        listaServicios[3] = new Productos("Reparacion y mantenimienteo de aire condicionado", 2500);
        listaServicios[4] = new Productos("Manteniento preventivo", 6000);
    }

}
