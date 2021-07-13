/*
 * Crear un programa que pida una frase y si esa frase es igual a “eureka” el
 * programa mostrará un mensaje de Correcto, sino, de Incorrecto. 
 * Nota: investigar la función equals()en Java.
 */
package parte02_Condicionales;

import java.util.Scanner;
public class Ejercicio09 { 
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in, "ISO-8859-1").useDelimiter("\n");
        String frase;
        
        System.out.println("INGRESE UNA FRASE: ");
        frase = leer.next();
        
        if (frase.equalsIgnoreCase("eureka")) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }
    
}
