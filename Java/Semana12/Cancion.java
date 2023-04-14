package Semana12;

import javax.swing.JOptionPane;

public class Cancion {
    static Cancion top10[] = new Cancion[10];
    private String id;
    private String titulo;
    private String autor;
    private int durarion;
    private int anioCreacion;

    /*
     * ? Constructor
     */
    public Cancion(String id, String titulo, String autor, int durarion, int anioCreacion) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.durarion = durarion;
        this.anioCreacion = anioCreacion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getDurarion() {
        return durarion;
    }

    public void setDurarion(int durarion) {
        this.durarion = durarion;
    }

    public int getAnioCreacion() {
        return anioCreacion;
    }

    public void setAnioCreacion(int anioCreacion) {
        this.anioCreacion = anioCreacion;
    }

    /*
     * ? instanciar top 10
     */
    public static void instanciarCanciones() {
        top10[0] = new Cancion("1", "Si tu amor no vuelve", "Carin Leon", 333, 2000);
        top10[1] = new Cancion("2", "Adan y Eva", "Paulo londra", 459, 2001);
        top10[2] = new Cancion("3", "Mirame", "Mike Tower", 345, 2023);
        top10[3] = new Cancion("4", "Tu", "Carin Leon", 234, 2000);
        top10[4] = new Cancion("5", "Nada nuevo", "Christian Nodal", 623, 2005);
        top10[5] = new Cancion("6", "Adios amor", "Christian nodal", 888, 2023);
        top10[6] = new Cancion("7", "Admv", "Maluma", 234, 2023);
        top10[7] = new Cancion("8", "Amor toxico", "Christian Nodal", 654, 2018);
        top10[8] = new Cancion("9", "Aqui abajo", "Christian Nodal", 556, 2010);
        top10[9] = new Cancion("10", "Ayayay", "Christian Nodal", 354, 2015);
    }

    /*
     * ? Metodo de canciones anteriores
     */
    public static void cancionesAnteriores() {
        String mensaje = "";
        int contador = 0;
        for (int i = 0; i < top10.length; i++) {
            if (top10[i].anioCreacion < 2023) {
                contador++;
                mensaje += contador + ". " + top10[i].titulo + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, mensaje);
    }

    /*
     * ? Metodo de canciones actuales
     */
    public static void cancionesAnioActual() {
        String mensaje = "";
        int contador = 0;
        for (int i = 0; i < top10.length; i++) {
            if (top10[i].anioCreacion == 2023) {
                contador++;
                mensaje += contador + ". " + top10[i].titulo + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, mensaje);
    }

    /*
     * ? Metodo de canciones posteriores
     */
    public static void cancionesPosteriores() {
        JOptionPane.showMessageDialog(null, "No hay canciones despues de este año!");
    }

    /*
     * ? Metodo de cancion de mayor duracion
     */
    public static void cancionMayorDuracion() {
        int comparacion = top10[0].durarion;
        int pocision = 0;
        for (int i = 0; i < top10.length; i++) {
            if (top10[i].durarion > comparacion) {
                comparacion = top10[i].durarion;
                pocision = i;
            }
        }
        JOptionPane.showMessageDialog(null, top10[pocision].titulo);
    }

    /*
     * ? Metodo para el primer lugar
     */
    public static void cancionNumeroUno() {
        JOptionPane.showMessageDialog(null, "Cancion: " + top10[0].titulo + "\n" + "Autor: " + top10[0].autor + "\n"
                + "Duracion: " + top10[0].durarion + "s\n" + "Año: " + top10[0].anioCreacion);
    }

    /*
     * ? Metodo para mostar todas las canciones
     */
    public static void mostrarCanciones() {
        String mensaje = "";
        for (int i = 0; i < top10.length; i++) {
            mensaje += (i + 1) + ". " + top10[i].titulo + "\n";
        }
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
