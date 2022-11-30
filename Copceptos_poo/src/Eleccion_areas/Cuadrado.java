package Eleccion_areas;

public class Cuadrado extends figura{

private float lado;

public Cuadrado(){

}
public Cuadrado(float lado){
    this.lado=lado;
}
public float getlado(){//OBETNER DATOS GET
    return lado;
}
public void setlado(float lado){//ESTABLECER DATOS SET
    this.lado = lado;
}


@Override
public void calcularArea(){
    Float area = lado *lado;
    System.out.println("El lado que digito fue "+lado+" y "+lado+" por "+lado+" da el area "+area);
}
}