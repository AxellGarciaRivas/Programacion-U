package Proyecto;

public class Ventas {

  private String numeroVentas;
  private int monto;
  private String producto;
  private String metodoPago;
  private String infoComprador;
  private String infoVendedor;
  private String fechaVenta;

  public void facturacion(
    String numeroVentas,
    int monto,
    String producto,
    String metodoPago,
    String infoComprador,
    String infoVendedor,
    String fechaVenta
  ) {
    this.numeroVentas = numeroVentas;
    this.monto = monto;
    this.producto = producto;
    this.metodoPago = metodoPago;
    this.infoComprador = infoComprador;
    this.infoVendedor = infoVendedor;
    this.fechaVenta = fechaVenta;
  }

  public String getNumeroVentas() {
    return numeroVentas;
  }

  public void setNumeroVentas(String numeroVentas) {
    this.numeroVentas = numeroVentas;
  }

  public int getMonto() {
    return monto;
  }

  public void setMonto(int monto) {
    this.monto = monto;
  }

  public String getProducto() {
    return producto;
  }

  public void setProducto(String producto) {
    this.producto = producto;
  }

  public String getMetodoPago() {
    return metodoPago;
  }

  public void setMetodoPago(String metodoPago) {
    this.metodoPago = metodoPago;
  }

  public String getInfoComprador() {
    return infoComprador;
  }

  public void setInfoComprador(String infoComprador) {
    this.infoComprador = infoComprador;
  }

  public String getInfoVendedor() {
    return infoVendedor;
  }

  public void setInfoVendedor(String infoVendedor) {
    this.infoVendedor = infoVendedor;
  }

  public String getFechaVenta() {
    return fechaVenta;
  }

  public void setFechaVenta(String fechaVenta) {
    this.fechaVenta = fechaVenta;
  }

  public static boolean modificarRegistro() {
    boolean confirmacion = false;

    return confirmacion;
  }

  public static boolean eliminarRegistro() {
    boolean confirmacion = false;

    return confirmacion;
  }

  public static boolean agregarVenta() {
    boolean confirmacion = false;

    return confirmacion;
  }

  public static void consultarVenta() {
    
  }

  
}
