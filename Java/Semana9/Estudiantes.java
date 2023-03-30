package Semana9;

public class Estudiantes {
    private String nombre; 
    private String apellidos;
    private String cedula;

    static Estudiantes estudiantesArray[] = new Estudiantes[5];
    

	public Estudiantes(String nombre, String apellido, String cedula) {
        this.nombre = nombre;
        this.apellidos = apellido;
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCedula() {
        return cedula;
    }

    public static void agregarEstudiante(String nombre, String apellidos, String cedula) {
        // estudianteArray[]Estudiantes()
        for (int i = 0; i < estudiantesArray.length; i++) {
            if (estudiantesArray[i].equals(null)) {
                // estudiantesArray[i] = Estudiantes(nombre, apellidos, cedula);
            }
        }
    }
}
