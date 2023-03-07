package Semana6.Practica;

public class Usuario {
    public String nombre = "";
    public int edad = 0;
    private String contrasenia= "";

   
    public void setContrasenia(String contrasenia) {
        char a = '\0';
        // char b;
        for (int i = 0; i < contrasenia.length(); i++) {
            b = a;
            a = contrasenia.charAt(i);
        }
    
      this.contrasenia = contrasenia;
    }

    public String getContrasenia() {
        return contrasenia;
    }

}
