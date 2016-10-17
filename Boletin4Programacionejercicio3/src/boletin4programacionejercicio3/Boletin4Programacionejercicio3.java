
package boletin4programacionejercicio3;

import javax.swing.JOptionPane;

/**
 *
 * @author Brais
 */
public class Boletin4Programacionejercicio3 {

    public static void main(String[] args) {
    
        Circulo circ1 = new Circulo();
        
        circ1.setRadio(5);
        double area = circ1.calcularArea();
        JOptionPane.showMessageDialog(null, "El área de la circunferencia es " + area);
        double lonxitude = circ1.calcularLonxitude();
        JOptionPane.showMessageDialog(null, "La longitud de la circunferencia es " + lonxitude);
        
       
       
           
        
                
   }
}
