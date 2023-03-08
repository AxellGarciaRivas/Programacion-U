package Proyecto;

public class Productos {
    public class Carro {
        public String id;
        public String marca;
        public estado estado;
        public String descripcion;
        public int precio;

        public enum estado {
            Nuevo,
            Usado
        }
        
        public Carro(String id, String marca, int estado, String descripcion, int precio) {
            this.id = id;
            this.marca = marca;
            // this.estado = estado;
            this.descripcion = descripcion;
            this.precio = precio;
        }
    }

    public static void mostrarInventarioCarro() {

    }

    public static void mostrarInventarioServicio() {

    }

    public static boolean sacarVehiculo() {
        boolean confirmacion = false;

        return confirmacion;
    }

    public static boolean agregarVehiculo() {
        boolean confirmacion = false;
        
        return confirmacion;
    }
}
