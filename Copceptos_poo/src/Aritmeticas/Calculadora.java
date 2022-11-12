package Aritmeticas;

import java.util.Scanner;

public class Calculadora {
    Scanner leer=new Scanner(System.in);
    //Atributos
    int num1, num2;
    double exponum1,exponum2;
    


    //Metodos 
    public void pregunta(){
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese el primer numero");
        num1=leer.nextInt();
        System.out.println("ingrese el segundo numero");
        num2=leer.nextInt();
    }

   
    //1.metodos sin valor de retorno que sume los dos numeros
    public void sumadelosnumeros(int newsuma ){
        newsuma=num1+num2;
        System.out.println("la suma de los numeros es = "+newsuma);
    }

    //2.Metodo con valor de retorno que reste los 2 numeros
    public int restadelosnumeros (int newresta){
        newresta=num1-num2;
        System.out.println("la resta de "+num1+" menos "+num2+" es = "+newresta);
        return newresta;
    }
    //3.metodo con valor de retorno que devuelva cual es el numero mayor
    public int numeromayor (int numero){
        if(num1<num2){
            System.out.println("el numero mayor es = "+num2);
        }
        else if(num1>num2){
            System.out.println("el numero mayor es = "+num1);
        }
        return numero;
    }
    // 4.metodo sin valor de retorno de devuelva cual es el numero menor
    public void numeromenor(){
        if(num1< num2){
            System.out.println("el numero menor es = "+num1);
        }
        else if(num1>num2){
            System.out.println("el numero menor es = "+num2);
        }
       
    }
    // 5.metodo con valor de retorno que eleve cada numero al exponente que sea indicado por el usuario 
    public double exponente(){
        Scanner leer=new Scanner(System.in);
        System.out.println("Digite a que numero quiere elevar el numero "+num1);
        exponum1=leer.nextDouble();
        exponum1=(Math.pow(num1, exponum1));
        System.out.println("su resultado es = "+exponum1);
        return exponum1;
    }
    public double exponente2(){
        Scanner leer=new Scanner(System.in);
        System.out.println("Digite a que numero quiere elevar el numero "+num2);
        exponum2=leer.nextDouble();
        exponum2=(Math.pow(num2, exponum2));
        System.out.println("su resultado es = "+exponum2);
        return exponum2;
    }
}
