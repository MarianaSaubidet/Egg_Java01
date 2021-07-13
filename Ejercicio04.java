/*
 * Escribir un programa que pida una frase y la muestre toda en mayúsculas y
 * después toda en minúsculas. Nota: investigar la función toUpperCase() y
 * toLowerCase() en Java.
 */
package parte01;

import java.util.Scanner;
public class Ejercicio04 {
    public static void main(String[] args) {
        String frase;
        Scanner leer = new Scanner (System.in, "ISO-8859-1").useDelimiter("\n");
        System.out.println("INGRESE UNA FRASE: ");
        frase = leer.next();
        
        System.out.println("LA FRASE EN MAYUSCULAS ES: " + frase.toUpperCase());
        System.out.println("LA FRASE EN MINUSCULAS ES: " + frase.toLowerCase());
    }
    
}
