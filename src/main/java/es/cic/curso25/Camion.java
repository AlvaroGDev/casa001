package es.cic.curso25;

public class Camion extends Vehiculo {

      boolean remolque = false;
      double cargaMercanciaKg;

    public Camion(int velocidad, int numRuedas, String color, boolean remolque, double cargaMercanciaKg) {
        super(velocidad, numRuedas, color);
        this.remolque = remolque;
        this.cargaMercanciaKg = cargaMercanciaKg;
        /*
         * La clase recibe varios parámetros. 
         * Los parámetros dentro de súper son los que hereda de la clase padre (Comunes a todos los hijos)
         * El resto son los específicos de la clase hija (Remolque de un camión...)
         */
    }

    public double anadirCarga(double kgMercancia){
       return this.cargaMercanciaKg+= kgMercancia;
    }

    public Boolean getRemolque() {
        return this.remolque;
    }

    public int getVelocidad(){
        return this.velocidad;
    }

    public void setRemolque(boolean remolque) {
        this.remolque = remolque;
    }

  
    
    
}