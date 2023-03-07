package Semana3;

import javax.swing.JOptionPane;

public class practica1 {

  public static void main(String[] args) {
    int sumaEdad = 0;
    int promedio = 0;
    int numeroBajo = 0;
    int numeroAlto = 0;
    String[] botones = { "Si", "No" };

    boolean continuar = true;
    int i = 1;

    while (continuar) {
      int edad = Integer.parseInt(
        JOptionPane.showInputDialog("Ingrese la edad de la persona")
      );

      //suma de todas las edades
      sumaEdad += edad;

      //control del número más bajo
      if (numeroBajo == 0) {
        numeroBajo = edad;
      } else if (numeroBajo > edad) {
        numeroBajo = edad;
      }

      //control del número más alto
      if (numeroAlto == 0) {
        numeroAlto = edad;
      } else if (numeroAlto < edad) {
        numeroAlto = edad;
      }

      //promedio de todas las edades
      promedio = sumaEdad / i;

      //decision de
      int decision = JOptionPane.showOptionDialog(
        null,
        "Agregar otra edad?",
        "Continuamos?",
        0,
        JOptionPane.QUESTION_MESSAGE,
        null,
        botones,
        "Si"
      );

      //decision de detencion de ciclo
      if (decision == 1) {
        break;
      }

      //conteo de ciclo
      i++;
    }

    System.out.println("Edad más alta:  " + numeroAlto);
    System.out.println("Edad más baja: " + numeroBajo);
    System.out.println("Suma de las edades: " + sumaEdad);
    System.out.println("Promedio de las edades: " + promedio);
  }
}
