/*
 * Dada una cantidad de grados centígrados se debe mostrar su equivalente en
 * grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package parte01;

import java.util.Scanner;
public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in, "ISO-8859-1").useDelimiter("\n");
        
        double C, F;
        System.out.println("INGRESE LOS GRADOS CENTIGRADOS: ");
        C = leer.nextDouble();
        F = 32 + (9 * C / 5);
        System.out.println("LOS GRADOS INGRESADOS EN FAHRENHEIT SON: " + F);
    }
    
}
