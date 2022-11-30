package principal;

import salud.Empleado;

public class Inicio4 {
    public static void main(String[] args) {
        
        Empleado Empleado1=new Empleado("Cedula", "Jonathan", "Cañon", "Masculino", 1007107358, 19, 55.0, 1.70, 30000, 9, "Axiliar", "Call-center");

        Empleado1.calcularHonorarios();

        System.out.println("El empleado "+Empleado1.getNombre()+" "+Empleado1.getApellido()+", identificado con " +Empleado1.getTipoDoc()+" " +Empleado1.getDocumento()+", tiene un cargo de "+ Empleado1.getCargo()+", las horas laboradas son "+Empleado1.getHorasTrabajadas()+", el valor por cada hora es "+Empleado1.getValorHora()+" y su pago total, por el dia laborado es "+Empleado1.calcularHonorarios());

    }
}