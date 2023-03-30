package Semana8;

import javax.swing.JOptionPane;

public class Rutinas {

  static int numeros[] = new int[5];

  public static void ingresarNumeros() {
    for (int i = 0; i < numeros.length; i++) {
      numeros[i] =
        Integer.parseInt(
          JOptionPane.showInputDialog(null, "Ingrese un numero")
        );
    }
  }

  public static void mostrarArreglo() {
    for (int i = 0; i < numeros.length; i++) {
      JOptionPane.showMessageDialog(null, numeros[i]);
    }
  }

  public static void buscarNumero() {
    int numeroBuscar = Integer.parseInt(
      JOptionPane.showInputDialog("Ingrese el numero a buscar")
    );

    for (int i = 0; i < numeros.length; i++) {
      if (numeros[i] == numeroBuscar) {
        JOptionPane.showMessageDialog(
          null,
          "El numero esta en la pocision " + i + " del array"
        );
      }
    }
  }

  static int vendedores[] = new int[5];

  public static void vendedores() {
    int totalVenta = 0;
    for (int i = 0; i < numeros.length; i++) {
      int monto = Integer.parseInt(
        JOptionPane.showInputDialog(
          null,
          "Ingrese la venta del empleado " + (i + 1)
        )
      );
      if (monto > 0) {
        vendedores[i] = monto;
      } else {
        JOptionPane.showMessageDialog(null, "El monto escrito es inferior a 0");
        break;
      }
    }

    for (int i = 0; i < vendedores.length; i++) {
      totalVenta += vendedores[i];
    }
    JOptionPane.showMessageDialog(
      null,
      "El total de ventas de todos los empleados es: " + totalVenta
    );
  }

  public static void Matriz() {
    int valor1 = Integer.parseInt(
      JOptionPane.showInputDialog(null, "Ingrese el numero de filas y columnas")
      );
    int matriz[][] = new int[valor1][valor1];
    // int diagonal = 0;
    // int inversa = 0;
    // int mayor = 0;
    // for (int i = 0; i < matriz.length; i++) {

    //     for (int j = 0; j < matriz.length; j++) {
            
    //     }
        
    // }
    System.out.println(matriz.length);
  }

}