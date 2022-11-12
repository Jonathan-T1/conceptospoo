package salud;

import java.util.Scanner;

public class Persona {
    Scanner leer=new Scanner(System.in);
    double pesoactual,estatura;
    int peso;
    String resultado;
    public void pedirdatos(){
        System.out.println("ingrese su peso en kg");
        peso=leer.nextInt();
        System.out.println("ingrese su estatura ");
        estatura=leer.nextDouble();
    }
    public String calcularmc(){
        pesoactual=(peso/(Math.pow(estatura,2)));
        System.out.println(pesoactual);

        if(pesoactual<20){
            resultado="Pesobajo";
        }
        else if(pesoactual == 20 || pesoactual<=25){
            resultado="Pesoideal";
        }
        else {
            resultado="Tienessobrepeso";
        }
        return resultado;
    }

}
