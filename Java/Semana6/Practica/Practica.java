package Semana6.Practica;

import javax.swing.JOptionPane;

public class Practica {
    public static void main(String[] args) {

        Usuario usuario1 = new Usuario();
        usuario1.nombre = JOptionPane.showInputDialog(null, "Escribe tu nombre");
        usuario1.edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Escribe tu edad"));
        usuario1.setContrasenia(JOptionPane.showInputDialog(null, "Escribe tu contraseña"));
        System.out.println(usuario1.getContrasenia());


    }
}
