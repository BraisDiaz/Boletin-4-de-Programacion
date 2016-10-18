
package boletin4programacionejercicio4;

/**
 *
 * @author Brais
 */
public class Restaurante {
    private int pulpo;
    private int patatas;
    
public Restaurante (){
    pulpo = 0;
    patatas = 0;
}
public Restaurante (int pulp, int patat){
    pulpo = pulp;
    patatas = patat;
}
public void añadirPulpo(int pulp){
    pulpo = pulpo + pulp;
}
public void añadirPatatas (int patat){
    patatas = patatas + patat;
}
public void mostrarPulpo(){
    System.out.println("Hay " + pulpo + " kilos de pulpo en el almacén");
}
public void mostrarPatatas(){
    System.out.println("Hay " + patatas + " kilos de patatas en el almacén");
}
public void mostrarClientes(){
    System.out.println("Se pueden atender "+ (((pulpo*3)/2) + (patatas*3))/2 + "clientes");
}
}