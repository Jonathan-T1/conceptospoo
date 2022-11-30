package Reto5;

import java.util.Scanner;

public class Pruebasjuego1 {
   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int op;
        Piedra juego2=new Piedra();
        Carisellazo juego1=new Carisellazo();
        System.out.println("Elija 1 para Carisellazo \n Elija 2 para Piedra, Papel y Tijera. ");
        op=leer.nextInt();
        if(op==1){
        juego1.iniciar();
        juego1.jugar();
        juego1.finalizar();
        }
        else if(op==2){
        juego2.iniciar();
        juego2.jugar();
        juego2.finalizar();;
        }
        else {
            System.out.println("Opcio no valida");
        }
}
}