package Semana4;

public class Semana4 {
    public static void main(String[] args) {
        //Instanciar un objeto vacio (uso del constructor por defecto)
        Vehiculo vehiculo1 = new Vehiculo();
        vehiculo1.marca = "Toyoto";
        vehiculo1.placa = "VSV721";
        vehiculo1.anio = 2022;

        vehiculo1.calcularAntiguedad();
    }

    
}
