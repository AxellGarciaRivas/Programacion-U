package Semana3;

import javax.swing.JOptionPane;

public class Semana3 {

  public static void main(String[] args) {
    //Cuenta regresiva de año nuevo
    /*for (int i = 10; i > 0; i--) {
      JOptionPane.showMessageDialog(null, i);
    }

    JOptionPane.showMessageDialog(null, "Feliz año nuevo");

    //Practica de bloque de caracter
    int i = 0;
    while (i < 5) {
      for (int j = 0; j < 10; j++) {
        System.out.print("@");
      }
      System.out.println("");
      i++;
    }*/

    /*int j = 0;
    do {
        System.out.println("j vale: " + j);
        j++;
    } while (j < 5);*/

    int tabla = Integer.parseInt(
      JOptionPane.showInputDialog(null, "Cual sería la tabla a multiplicar")
    );

    int i = 1;
    while (i <= 10) {
      int resultado = tabla * i;

      System.out.println(tabla + " x " + i + " = " + resultado);

      i++;
    }
    /* 
     for (int i = 20; i <= 30; i++) {
         int valorCuadrado = i * i;
         System.out.println("El numero es " + i + " su valor al cuadrado es " + valorCuadrado);
        }
    */

  }
}
