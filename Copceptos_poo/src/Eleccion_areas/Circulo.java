package Eleccion_areas;

public class Circulo extends figura{

        //Atributos 
        private float radio;//encabsulado
        //Metodos
    
        public Circulo() {//construcor vacio
            
        }
        public Circulo(float radio) {//contructor con datos
            this.radio = radio;
        }
    
        public float getLado() {//obtener datos
            return radio;
        }
    
    
        public void setLado(float radio) {//establecer datos
            this.radio = radio;
        }
    
        @Override //sobre escribir
        public void calcularArea(){
            float area= (float) (Math.PI*Math.pow(radio, 2));
            System.out.println("El area del CIRCULO es igual a (A = π * r²) el area que ested solicito fue"+area);
        }
    
    
}
