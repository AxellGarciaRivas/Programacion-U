package Semana5;

import javax.swing.JOptionPane;

public class Aritmetica {

  int n1;
  int n2;
  int suma;
  int resta;
  int multi;
  int divi;

  public void pideNum() {
    n1 = Integer.parseInt(JOptionPane.showInputDialog("digite un numero"));
    n2 = Integer.parseInt(JOptionPane.showInputDialog("digite un numero"));
  }

  public void suma() {
    suma = n1 + n2;
  }
  public void resta() {
    suma = n1 - n2;
  }
  public void multiplicacion() {
    suma = n1 * n2;
  }
  public void division() {
    suma = n1 / n2;
  }
}
