package Semana10;

import javax.swing.JOptionPane;

public class Reparacion {

    private String marca;
    private String duenio;
    private String color;
    private String anio;
    private String placa;
    static Reparacion reparacionArray[] = new Reparacion[10];
    public String[] problema = new String[10];

    // constructor vacio
    public Reparacion() {
    }

    // constructor lleno
    public Reparacion(
            String marca,
            String duenio,
            String color,
            String anio,
            String placa) {
        this.marca = marca;
        this.duenio = duenio;
        this.color = color;
        this.anio = anio;
        this.placa = placa;
        problema = new String[10];
    }

    // Instanciacion de objeto
    public static void instanciarObjeto() {
        reparacionArray[0] = new Reparacion("Hyundai", "Axell Garcia Rivas", "Azul", "1998", "BBS777");
    }

    public void agregarProblemaObjeto() {
        for (int i = 0; i < problema.length; i++) {
            if (i > 0) {
                problema[i] = "";
            } else {
                problema[i] = "Quema de Aceite";
            }
        }
    }

    public void problema() {
        for (int i = 0; problema.length < 10; i++) {
            String[] botones = { "Si", "No" };
            int resultado = JOptionPane.showOptionDialog(
                    null,
                    "Agregar otra edad?",
                    "Continuamos?",
                    0,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    botones,
                    "Si");

            if (resultado == 0) {
            }
        }
    }

    // get y set de atributos privados
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDuenio() {
        return duenio;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
