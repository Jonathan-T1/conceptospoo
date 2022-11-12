package principal;

import java.util.Scanner;

import salud.Persona;

public class Inicio {public static void main(String[] args) {
    Scanner leer=new Scanner(System.in);
    Persona yo=new Persona();

    yo.pedirdatos();
    String resultado=yo.calcularmc();
    System.out.println(resultado);
    if(resultado.equals("Pesobajo")){
        System.out.println("Usted debe comer mas nutrientes");
    }
    else if(resultado.equals("Pesoideal")){
        System.out.println("Urra tienes el peso ideal sigue asi");
    }
    else if(resultado.equals("Tienessobrepeso")){
        System.out.println("Usted debe hacer mas ejercicio y tener una dieta !!Mas sana!!");
    }



    leer.close();
}
    
}
