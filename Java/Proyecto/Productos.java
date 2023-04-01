package Proyecto;

import javax.swing.JOptionPane;

public class Productos {
    private String id;
    private String marca;
    private String estado;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    /*
     * ? Constructor vacio
     */
    public Productos() {
    }

    /*
     * ? Constructor
     */
    public Productos(String id, String marca, String descripcion, int precio, String estado) {
        this.id = id;
        this.marca = marca;
        this.descripcion = descripcion;
        this.precio = precio;
        this.estado = estado;
    }

    /* 
     * ? Metodo de inicializacion del objeto
     */
    public static void inicializacionCarro() {
        listaCarro[0] = new Productos("1", "Hyundai", "Carro de cochera", 100, "Usado");
        listaCarro[1] = new Productos("2", "Toyota", "Carro muy cuidado", 200, "Usado");
        listaCarro[2] = new Productos("3", "Toyota", "Carro muy cuidado", 300, "Usado");
        listaCarro[3] = new Productos("4", "Toyota", "Carro muy cuidado", 400, "Usado");
        listaCarro[4] = new Productos("5", "Toyota", "Carro muy cuidado", 500, "Usado");

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
    public static void agregarVehiculo(String id, String marca, String descripcion, int precio, String estado) {
        for (int i = 0; i < listaCarro.length; i++) {

            if (listaCarro[i].getMarca() == null) {
                listaCarro[i] = new Productos(id, marca, descripcion, precio, estado);
                Logueo.mensaje("Carro agregado exitosamente");
                break;
            } else if (listaCarro[14].getMarca() != null) {
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
    public static void inicializacionServicio() {
        listaServicios[0] = new Productos("Cambio de aceite", 100);
        listaServicios[1] = new Productos("Venta", 10000);
        listaServicios[2] = new Productos("Lavado de vehiculos", 2000);
        listaServicios[3] = new Productos("Reparacion y mantenimienteo de aire condicionado", 2500);
        listaServicios[4] = new Productos("Manteniento preventivo", 6000);
    }

    /* 
     * ? Metodo de mostrar servicios
     */
    public static void mostrarServicio() {
        String servicios = "";

        for (int i = 0; i < listaServicios.length; i++) {
            if (i < listaCarro.length - 1) {
                servicios += (i + 1) + ". " + listaServicios[i].getServicio() + " \n";
            } else {
                servicios += (i + 1) + ". " + listaServicios[i].getServicio();
            }
        }
        Logueo.mensaje(servicios);
    }
}