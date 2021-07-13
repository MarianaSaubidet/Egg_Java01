/*
 * Crear un programa que dado un numero determine si es par o impar.
 */
package parte02_Condicionales;

import java.util.Scanner;
public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in, "ISO-8859-1").useDelimiter("\n");
        int num;
        System.out.println("INGRESE UN NUMERO ENTERO: ");
        num = leer.nextInt();
        
        if (num % 2 == 0) {
            System.out.println("EL NUMERO " + num + " ES PAR");
        } else {
            System.out.println("EL NUMERO " + num + " ES IMPAR");
        }
    }
    
}
