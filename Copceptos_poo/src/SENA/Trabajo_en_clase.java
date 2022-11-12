package SENA;

import java.util.Scanner;

public class Trabajo_en_clase {public static void main(String[] args) {
    Scanner leer=new Scanner(System.in);
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

    System.out.println("Querido "+yo.nombre+" identificado con CC "+yo.id+", Genero "+yo.genero+" con edad de "+yo.edad+" años y en estado de Ficha "+yo.ficha+" Ha sido haceptado sus datos correctamente ");
}
    
}
