package Proyecto;

public class Empleados {

  private String nombre;
  private String cedula;
  private int salario;
  public Puestos Puestos;

  private enum Puestos {
    Gerente,
    Supervisor,
    Accesor_Ventas,
  }

  public Empleados(String nombre, String cedula, int salario, String puesto) {
    this.nombre = nombre;
    this.cedula = cedula;
    this.salario = salario;
    // this.Puestos = puestos;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getCedula() {
    return cedula;
  }

  public void setCedula(String cedula) {
    this.cedula = cedula;
  }

  public int getSalario() {
    return salario;
  }

  public void setSalario(int salario) {
    this.salario = salario;
  }

  public static void monstrarEmpleados() {
    
  }

  public static boolean modificarRegistro() {
    boolean confirmacion = false;

    return confirmacion;
  }

  public static boolean eliminarRegistro() {
    boolean confirmacion = false;

    return confirmacion;
  }

  public static boolean ingresarNuevoEmpleado() {
    boolean confirmacion = false;

    return confirmacion;
  }

  public static boolean eliminarEmpleado() {
    boolean confirmacion = false;

    return confirmacion;
  }
}
