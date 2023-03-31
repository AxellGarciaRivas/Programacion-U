package Proyecto;

import javax.swing.JOptionPane;

public class Provedores {
    private String marca;
    static Provedores listaProvedores[] = new Provedores[10];

    /* 
     * ? Encapsuladores de atributos
     */
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marcas) {
        this.marca = marcas;
    }

    public Provedores() {

    }

    public Provedores(String marcas) {
        this.marca = marcas;
    }

    /*
     * ? Metodo de inicializacion del provedores
     */
    public static void instanciazionProvedor() {
        listaProvedores[0] = new Provedores("Hyundai");
        listaProvedores[1] = new Provedores("Toyota");
        listaProvedores[2] = new Provedores("Audi");
        listaProvedores[3] = new Provedores("BMW");

        for (int i = 4; i < listaProvedores.length; i++) {
            listaProvedores[i] = new Provedores();
        }
    }

    /*
     * ? Metodo para mostrar provedores
     */
    public static void mostrarProvedor() {
        String provedores = "";
        for (int i = 0; i < listaProvedores.length; i++) {

            if (i < listaProvedores.length - 1) {
                provedores += (i + 1) + ". " + listaProvedores[i].getMarca() + " \n";
            } else {
                provedores += (i + 1) + ". " + listaProvedores[i].getMarca();
            }
        }
        Logueo.mensaje(provedores);
    }

    public static void modificarProvedor() {
        Logueo.mensaje("Se mostrara la lista de marcas con la posicion podras modificar dicha marca");
        mostrarProvedor();
        int posicion = Integer.parseInt(JOptionPane.showInputDialog(null, "Digta la posicion del usuario que desea modificar"));
        listaProvedores[posicion].marca = JOptionPane.showInputDialog(null, "Ingrese la correccion de marca");
    }

    /* 
     * ? Metodo para agregar provedor
     */
    public static void agregarProvedor(String marca) {
        for (int i = 0; i < listaProvedores.length; i++) {

            if (listaProvedores[i].getMarca() == null) {
                listaProvedores[i] = new Provedores(marca);
                Logueo.mensaje("Provedor agregado exitosamente");
                break;
            } else if (listaProvedores[10] != null) {
                Logueo.mensaje("Maximo de provedores agregados");
            }
        }
    }

    /*
     * ? Metodo para eliminar provedor
     */
    public static void eliminarProvedor() {
        Logueo.mensaje("Se mostrara la lista de marcar con la posicion podras eliminar provedores");
        mostrarProvedor();
        int posicion = Integer
                .parseInt(JOptionPane.showInputDialog(null, "Digta la posicion de la marca que desea eliminar"));

        listaProvedores[posicion - 1] = new Provedores();
        Logueo.mensaje("Se ha eliminado el provedor");
        mostrarProvedor();
    }
}
