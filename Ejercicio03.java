/*
 * Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre
 * por pantalla.
 */
package parte01;

import java.util.Scanner;
public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in, "ISO-8859-1").useDelimiter("\n");
        String nombre;
        System.out.println("INGRESE SU NOMBRE: ");
        nombre = leer.next();
        System.out.println("SU NOMBRE ES: " + nombre);
    }
    
}
