package GG;
public class Valorreotrno {
    //Atributos
    public String nombre;
    public int edad;
    //Metodos

    //Metodo sin valor de retorno
    public void registraranimal(){
        System.out.println("este es el metodo registraranimal()");
    }
    //Metodo sin valor de retorno con parametros
    public void cambiarnombre(String newname){
        nombre=newname;
        System.out.println("El nuevo nombre es "+nombre);
    }
    public int calcularedad (int anioNacimiento){
        edad=2022-anioNacimiento;
        return edad;
    }
}
