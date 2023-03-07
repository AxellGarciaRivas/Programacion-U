package Semana7;

import javax.swing.JOptionPane;

public class rutinas {

    public static double valores(double valor1 , double valor2) {
        double x;
        x = Math.pow(valor1, 2) / ((valor1 + valor2) * valor2);
        return x;
    }

    public static void palabra() {
        String palabra = JOptionPane.showInputDialog(null, "Ingresa una palabra");

        int b = 0;
        String palabraMostrar = "";
        for(int i = 0; i < palabra.length(); i++) {

            if (i < palabra.length() - 1) {
                palabraMostrar += palabra.substring(b, i + 1) + "  ";

            } else {
                palabraMostrar += palabra.substring(b, i + 1);
            }

            b++;
        }
        JOptionPane.showMessageDialog(null, palabraMostrar);
        JOptionPane.showMessageDialog(null, palabra.toUpperCase());

    }
    
}
