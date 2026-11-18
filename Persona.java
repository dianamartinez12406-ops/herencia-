public class Persona {
    String nombre;
    int edad;
    String sexo;

    public Persona(String nombre,int edad, String sexo ){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }
    public void saludar(){
        System.out.println("Hola ,mi nombre es " + nombre + " mi edad es "+ edad + " mi sexo es " + sexo);
    }
}    



