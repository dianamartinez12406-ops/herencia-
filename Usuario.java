public class Usuario extends Persona {
    public String correo;
    public String contrasena;

    public Usuario (String nombre, int edad, String sexo, String correo,String contrasena ){
        super(nombre, edad, sexo);
        this.correo = correo;
        this.contrasena = contrasena;

    }
    public void informacionUsuario(){
        System.out.println("mi correo es: " + correo + " la contrasena es:" + contrasena);
    }



}
