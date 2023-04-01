package Proyecto;

import javax.swing.JOptionPane;

public class Logueo {
    private String usuario;
    private String contrasenia;
    static Logueo logueoUsuarios[] = new Logueo[10];

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    /*
     * ? Constructor vacio
     */
    public Logueo() {

    }

    /*
     * ? Construtor
     */
    public Logueo(String usuario, String contrasenia) {
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }

    /*
     * ? Inicializacion de objeto
     */
    public static void inicializacionUsuarioLogueo() {
        logueoUsuarios[0] = new Logueo("Administrador", "12345");

        for (int i = 1; i < logueoUsuarios.length; i++) {
            logueoUsuarios[i] = new Logueo();
        }
    }

    /*
     * ? Metodo de agregacion de usuario de logueo
     */
    public static void agregarUsuario(String usuario, String contrasenia) {
        for (int i = 0; i < logueoUsuarios.length; i++) {
            if (logueoUsuarios[i].getUsuario() == null) {
                logueoUsuarios[i] = new Logueo(usuario, contrasenia);
                mensaje("Usuario agregado exitosamente");
                break;
            } else if (logueoUsuarios[9].getUsuario() != null) {
                mensaje("Maximo de usuarios agregados");
            }
        }
    }

    /*
     * ? Metodo de modificacion de usuario
     */
    public static void modificarUsuario() {
        mensaje("Se mostrara la lista de usuario con la posicion podras modificar dicho usuario");
        listaArray();
        int posicion = Integer
                .parseInt(JOptionPane.showInputDialog(null, "Digta la posicion del usuario que desea modificar"));
        String usuario = JOptionPane.showInputDialog(null, "Ingrese Usuario");
        String contrasenia = JOptionPane.showInputDialog(null, "Ingrese Crontraseña");
        pocision(posicion, usuario, contrasenia);
        mensaje("Se ha modificado el usuario sastifactoriamente");
    }

    /*
     * ? Metodo de Eliminacion de usuario
     */
    public static void eliminarUsuario() {
        mensaje("Se mostrara la lista de usuario con la posicion podras eliminar dicho usuario");
        listaArray();
        int posicion = Integer
                .parseInt(JOptionPane.showInputDialog(null, "Digta la posicion del usuario que desea modificar"));

        logueoUsuarios[posicion - 1] = new Logueo();
        mensaje("Se ha eliminado el usuario con exito");
    }

    /*
     * ? Mensaje a mostrar
     */
    public static void mensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

    /*
     * ? Creando mensaje de lista
     */
    public static void listaArray() {
        String usuarios = "";

        for (int i = 0; i < logueoUsuarios.length; i++) {

            if (i < logueoUsuarios.length - 1) {
                usuarios += (i + 1) + ". " + logueoUsuarios[i].getUsuario() + " \n";
            } else {
                usuarios += (i + 1) + ". " + logueoUsuarios[i].getUsuario();
            }
        }
        mensaje(usuarios);
    }

    /*
     * ? Eligiendo la pocision
     */
    public static void pocision(int pocision, String usuario, String contrasenia) {
        logueoUsuarios[pocision - 1].setUsuario(usuario);
        logueoUsuarios[pocision - 1].setContrasenia(contrasenia);
    }

    /*
     * ? Validacion de logueo
     */
    public static boolean validacionLogueo(String usuario, String contrasenia) {
        boolean acceso = false;

        for (int i = 0; i < logueoUsuarios.length; i++) {

            if (usuario.equals(logueoUsuarios[i].getUsuario())
                    && contrasenia.equals(logueoUsuarios[i].getContrasenia())) {
                acceso = true;
                break;
            }
        }
        return acceso;
    }
}