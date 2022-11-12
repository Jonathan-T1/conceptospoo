package SENA;

import java.util.Scanner;

public class Aprendiz {
    public String nombre="Carlos mancera";
    public int id;
    public String genero;
    public int edad;
    public int ficha;

    public void cambiarnombreAprendiz(){
    Scanner leer=new Scanner(System.in);

    System.out.println("Actualmente se encuentra registrados el nombre "+nombre);
    
    System.out.println("Ingrese el nuevo nombre");
    nombre=leer.nextLine();

    System.out.println("El nuevo nombre es "+nombre);
    /*Scanner leer=new Scanner(System.in);
    Aprendiz yo=new Aprendiz();
    System.out.println("Ingrese su nombre");
    yo.nombre=leer.nextLine();
    System.out.println("Digite su numero de CC o TI");
    yo.id=leer.nextInt();
    yo.genero="Masculino";
    System.out.println("Digite sus años");
    yo.edad=leer.nextInt();
    System.out.println("Digite su numero de ficha");
    yo.ficha=leer.nextInt();
    System.out.println("Querido "+yo.nombre+" identificado con CC "+yo.id+", Genero "+yo.genero+" con edad de "+yo.edad+" años y en estado de Ficha "+yo.ficha+" Ha sido haceptado sus datos correctamente ");*/
    }
}
