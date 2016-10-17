
package boletin4programacion;

/**
 *
 * @author Brais
 */
public class Coche {
    //declaro atributos
    private int velocidad, aceleracion, frenado;
    //constructor sin parámetros
   public Coche(){
        velocidad = 0;
        aceleracion = 0;
        frenado = 0;
    }
    public Coche (int vel, int valor, int menos){
        velocidad = vel;
        aceleracion = valor;
        frenado = menos;
   }
    public int getVelocidade(){
        return aceleracion - frenado;
    }
  
    public void acelerar (int valor){
        aceleracion = valor;
    }
    public void frenar (int menos){
        frenado = menos;
}
}
