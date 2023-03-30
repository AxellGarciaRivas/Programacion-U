package Semana6.Tarea;

public class Controlar_Cancion {

  private String idCancion;
  private String titulo;
  private String autor;
  private int duracion;
  private String anioCreacion;

  public void conctrolarCancion(
    String idCancion,
    String titulo,
    String autor,
    int duracion,
    String anionCreacion
  ) {
    this.idCancion = idCancion;
    this.titulo = titulo;
    this.autor = autor;
    this.duracion = duracion;
    this.anioCreacion = anionCreacion;
  }

  public String getIdCancion() {
    return idCancion;
  }

  public void setIdCancion(String id) {
    this.idCancion = id;
  }

  public String gettitulo() {
    return titulo;
  }

  public void settitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public int getDuracion() {
    return duracion;
  }

  public void setDuracion(int duracion) {
    this.duracion = duracion;
  }

  public String getAnioCreacion() {
    return anioCreacion;
  }

  public void setAnioCreacion(String anioCreacion) {
    this.anioCreacion = anioCreacion;
  }
}
