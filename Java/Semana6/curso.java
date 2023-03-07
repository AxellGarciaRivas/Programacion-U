package Semana6;

public class curso {
    public int id = 0;
    public String nombre= "";
    private String correo = "";
    public enumeraciones enumeraciones; //estados

    public String getCorreo() {
        return correo.substring(0, 3) + "***" + correo.substring(correo.indexOf("@"));
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

}
