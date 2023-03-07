package Semana1;

import javax.swing.JOptionPane;

public class Semana1 {

  public static void main(String[] args) {
    int edad = Integer.parseInt(
      JOptionPane.showInputDialog(null, "Cual seria tu edad?")
    );

    if (edad >= 18) {
      JOptionPane.showMessageDialog(
        null,
        "Tienes edad suficiente para conducir"
      );
    }
  }
}
