/*
 * Escribir un programa que pida dos números enteros por teclado y calcule la 
 * suma de los dos. El programa deberá después mostrar el resultado de la suma
 */
package parte01;

import java.util.Scanner;
public class Ejercicio02 {
    public static void main(String[] args) {
        int num1, num2, resultado;
        
        Scanner leer = new Scanner (System.in, "ISO-8859-1").useDelimiter("\n");
        System.out.println("INGRESA LOS NUMEROS PARA SUMAR: ");
        
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        resultado = num1 + num2;
        System.out.println("EL RESULTADO DE LA SUMA ES: " + resultado);
        
        // Otra forma:
        System.out.println("EL RESULTADO DE LA SUMA ES: " + (num1 + num2));
    }
    
}
