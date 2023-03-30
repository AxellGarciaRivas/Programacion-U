package Semana6.Tarea;

public class Tarea {
    
    public static void main(String[] args) {
        Controlar_Cancion control_Cancion1 = new Controlar_Cancion();
        control_Cancion1.conctrolarCancion("1234", "Bizarrap", "Chistian nodal", 200, "2019");
        control_Cancion1.setIdCancion("4321");
        System.out.println(control_Cancion1.getIdCancion());
    }
}
