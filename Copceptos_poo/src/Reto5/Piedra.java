package Reto5;

import java.util.Scanner;

public class Piedra implements Juego{
    private String nombre;
    private int user, cpu=0;
    Scanner leer = new Scanner(System.in);

    @Override
    public void iniciar() {
        System.out.println("Ingrese el nombre del jugador");
        nombre=leer.nextLine();
    }
    @Override
    public void Pregunta(){

    }

    @Override
    public void jugar() {
        System.out.println("para jugar eliga, 1 piedra, 2 papel, 3 tijera.");
        user=leer.nextInt();
        System.out.println(".......CPU eligiendo......");
        cpu = (int)(Math.random()*3)+1;
    }

    
    @Override
    public void finalizar() {
        if(user==1 && cpu==2){
            System.out.println(nombre+" sacaste piedra y la maquina papel, perdiste ");
        }
        else if(user==2 && cpu==1){
            System.out.println(nombre+" sacaste papel y la maquina piedra, ganaste ");
        }
        else if(user==1 && cpu==3){
            System.out.println(nombre+" sacaste piedra y la maquina tijera, ganaste ");
        }
        else if(user==3 && cpu==1){
            System.out.println(nombre+" sacaste tijera y la maquina piedra, perdiste ");
        }
        else if(user==2 && cpu==3){
            System.out.println(nombre+" sacaste papel y la maquina tijera, perdiste ");
        }
        else if(user==3 && cpu==2){
            System.out.println(nombre+" sacaste tijera y la maquina papel, ganaste ");
        }
        else if(user==1 && cpu==1 || user==2 && cpu==2 || user==3 && cpu==3){
            System.out.println(nombre+" Sacaste lo mismo que la maquina Empate ");
        }
        else{
            System.out.println("Datos no validos ");
        }
        System.out.println("Adios");
        
    }
}
