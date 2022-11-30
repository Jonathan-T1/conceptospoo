package Eleccion_areas;

public class Rectangulo extends figura {
    private float altura, base;

    public Rectangulo(){

    }

    public Rectangulo(float altura, Float base){
        this.altura = altura ;
        this.base = base ;
    }
    public float getarea(){
        return altura;
    }
    public void setarea(float altura){
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
        float area = base* altura;
        System.out.println("El area del rectangulo  es "+base+" por "+altura+" su area es "+area);
    }
    
    
}
