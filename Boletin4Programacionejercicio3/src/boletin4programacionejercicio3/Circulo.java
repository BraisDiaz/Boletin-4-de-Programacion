
package boletin4programacionejercicio3;
/**
 *
 * @author Brais
 */
public class Circulo {
    //declaro variables
    private double radio; 
    private final double PI = 3.14;
   //creo constructor sin parámetros
     public Circulo(){
        radio = 0;
    }
   //creo constructor con parámetros
     public Circulo (double rad){
        radio = rad;
     }
     public void setRadio (double radio){
        this.radio = radio;
     }
     public double calcularArea (){
         return PI*Math.pow(radio, 2);
     }
     public double calcularLonxitude (){
         return PI*2*Math.pow(radio, 2);
     }
     
    
    
   
   
    
}
