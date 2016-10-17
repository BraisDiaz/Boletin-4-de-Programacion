
package boletin4programacion;

import javax.swing.JOptionPane;

/**
 *
 * @author Brais
 */
public class Boletin4Programacion {

    public static void main(String[] args) {
        //creamos el objeto de la clase Coche llamado testeo
        Coche testeo = new Coche();
        //damos valores al objeto
        
         testeo.acelerar(30);
         testeo.frenar(10);
     
         int velocidad = testeo.getVelocidade();
     JOptionPane.showMessageDialog(null, "El coche va a " + velocidad + "km/h");
     
    
     
     
     
        
        
        
    }
    
}
