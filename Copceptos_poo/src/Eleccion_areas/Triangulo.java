package Eleccion_areas;

public class Triangulo extends figura {
    private float altura, base;

    public Triangulo(){

    }

    public Triangulo(float altura, Float base){
        this.altura = altura ;
        this.base = base ;
    }
    public float getaltura(){
        return altura;
    }
    public void setAltura(float altura){
        this.altura = altura;
    }
    public float getbase(){
        return base;
    }
    public void setbase(float base){
        this.base = base;
    }

    @Override
    public void calcularArea() {
        float area = base* altura/2;
        System.out.println("El area de un Triangulo  es "+base+" por "+altura+" dividido 2,..su area es "+area);
    }
    
}
