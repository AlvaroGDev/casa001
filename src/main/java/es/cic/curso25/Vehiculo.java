package es.cic.curso25;


public class Vehiculo {
  
    int velocidad;
    int numRuedas;
    String color;

   public Vehiculo(int velocidad, int numRuedas, String color){
    this.velocidad = velocidad;
    this.numRuedas = numRuedas;
    this.color = color;

    
   }

   public int acelerar(int velocidadAceleracion){
        return this.velocidad += velocidadAceleracion;
    }

}
