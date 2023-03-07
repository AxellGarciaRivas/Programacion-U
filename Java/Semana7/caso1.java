package Semana7;

import javax.swing.JOptionPane;

public class caso1 {

  public static void main(String[] args) {
    String[] opciones = { "Aritmetica", "Palabra"};

    int respuesta = JOptionPane.showOptionDialog(
      null,
      "Que ejecución deseas realizar?",
      "Eleccion de función",
      0,
      JOptionPane.QUESTION_MESSAGE,
      null,
      opciones,
      opciones
    );

    if (respuesta == 0) JOptionPane.showMessageDialog(
      null,
      "El valor de la X es: " +
      rutinas.valores(
        Double.parseDouble(
          JOptionPane.showInputDialog(null, "Ingrese el primer valor")
        ),
        Double.parseDouble(
          JOptionPane.showInputDialog(null, "Ingrese el segundo valor")
        )
      )
    );

    if (respuesta == 1) rutinas.palabra();

    if (respuesta != 0 && respuesta != 1) JOptionPane.showMessageDialog(
      null,
      "No elegiste ninguna opción! \nHasta luego."
    );
  }
}
