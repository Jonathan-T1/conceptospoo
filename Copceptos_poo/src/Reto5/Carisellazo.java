package Reto5;

import java.util.Random;
import java.util.Scanner;

public class Carisellazo implements Juego {

    //Atributos
    private String nombre;
    private int election, moneda, op;
    Scanner leer = new Scanner(System.in);

    @Override
    public void iniciar() {
        System.out.println("Ingrese el nombre del jugador");
        nombre=leer.nextLine();
    }
    @Override
    public void Pregunta(){
        System.out.println("Para jugar carisellaxo eliga 1 y Para jugar piedra, papel y tijera selecione 2");
        op=leer.nextInt();
    }

    @Override
    public void jugar() {
        System.out.println("escoge 1 cara y 2 sello ");
        election=leer.nextInt();
        System.out.println(".......moneda girando......");
        Random aleatorio=new Random();
        moneda=aleatorio.nextInt(2)+1;
    }

    @Override
    public void finalizar() {
        if(moneda==1 && election==1){
            System.out.println("callo cara, seleccionaste cara.... Ganaste!!... "+nombre);
        }
        else if(moneda==1 && election==2){
            System.out.println("callo cara, seleccionaste sello.... Perdiste!!... "+nombre);
        }
        else if(moneda==2 && election==2){
            System.out.println("callo sello, seleccionaste sello.... Ganaste!!... "+nombre);
        }
        else if(moneda==2 && election==1){
            System.out.println("callo sello, seleccionaste cara.... Perdiste!!... "+nombre);
        }
        

    }

    
}
