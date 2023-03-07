package Semana5;

import javax.swing.JOptionPane;

public class Operando {

  public int suma(int n1, int n2) {
    int suma = n1 + n2;
    return suma;
  }

  public int resta(int n1, int n2) {
    int resta = n1 + n2;
    return resta;
  }

  public int multiplicacion(int n1, int n2) {
    int multiplicacion = n1 * n2;
    return multiplicacion;
  }

  public int division(int n1, int n2) {
    int division = n1 / n2;
    return division;
  }

  public void muestrasResultados(
    int suma,
    int resta,
    int multiplicacion,
    int division
  ) {
    JOptionPane.showMessageDialog(
      null,
      "suma:" +
      suma +
      "\n resta:" +
      resta +
      "\n multiplicacion:" +
      multiplicacion +
      "\n division:" +
      division
    );
  }
}
