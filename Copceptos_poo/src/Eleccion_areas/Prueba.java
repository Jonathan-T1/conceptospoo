package Eleccion_areas;

import java.util.Scanner;

public class Prueba {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
        int op;
        System.out.println("Elige a que figura geometrica quieres sacarle area 1.Cuadrado 2.Circulo 3.Rectangulo 4.Triangulo");
        op=leer.nextInt();
        switch(op){
            case 1:
            System.out.println("ingrese el valor del lado del cuadrado");
            float lado = leer.nextFloat();
            Cuadrado c1 = new Cuadrado();
            c1.setlado(lado);
            c1.calcularArea();
            break;
            case 2:
            System.out.println("ingrese el valor del radio del circulo");
            float radio = leer.nextFloat();
            Circulo C2 = new Circulo();
            C2.setLado(radio);
            C2.calcularArea();
            break;
            case 3:
            System.out.println("ingrese el valor de la base del rectangulo");
            float base = leer.nextFloat();
            System.out.println("ingrese el valor de la altura del rectangulo");
            float altura = leer.nextFloat();
            Rectangulo c3 = new Rectangulo();
            c3.setarea(altura);
            c3.setbase(base);
            c3.calcularArea();
            break;
            case 4:
            System.out.println("ingrese el valor de la base del rectangulo");
            float base2 = leer.nextFloat();
            System.out.println("ingrese el valor de la altura del rectangulo");
            float altura2 = leer.nextFloat();
            Rectangulo c4 = new Rectangulo();
            c4.setarea(altura2);
            c4.setbase(base2);
            c4.calcularArea();
            break;
        }
        leer.close();
    }
    
}
