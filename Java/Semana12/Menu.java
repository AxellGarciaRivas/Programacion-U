package Semana12;

import javax.swing.JOptionPane;

public class Menu {
    
    public static void menu(){
        Cancion.instanciarCanciones();
        
        String[] botones = { "Canciones anteriores al año", "Canciones de este año", "Canciones posterior a este año",
                "Cancion de mayor duracion", "Autor de la cancion del primer lugar", "Mostar las canciones" };
    
        int decision = JOptionPane.showOptionDialog(null, "¿A que sección del programa deseas ir?", "Menú principal", 0,
                    JOptionPane.QUESTION_MESSAGE, null, botones, "Autor de la cancion del primer lugar");
        switch (decision) {
            case 0:
                Cancion.cancionesAnteriores();
                menu();
                break;
            case 1:
                Cancion.cancionesAnioActual();
                menu();
                break;
            case 2:
                Cancion.cancionesPosteriores();
                menu();
                break;
            case 3:
                Cancion.cancionMayorDuracion();
                menu();
                break;
            case 4:
                Cancion.cancionNumeroUno();
                menu();
                break;
            case 5:
                Cancion.mostrarCanciones();
                menu();
                break;
        
            default:
                break;
        }
    }
}
