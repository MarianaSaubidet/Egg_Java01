/*
 * Implementar un programa que dado dos números enteros determine cuál es el
 * mayor y lo muestre por pantalla.
 */
package parte02_Condicionales;

import java.util.Scanner;
public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in, "ISO-8859-1").useDelimiter("\n");
        
        int num1, num2, mayor;
        mayor = 0;
        System.out.println("INGRESA PRIMER NUMERO : ");
        num1 = leer.nextInt();
        System.out.println("INGRESA SEGUNDO NUMERO : ");
        num2 = leer.nextInt();
        
        if (num1 > num2) {
            mayor = num1;
            System.out.println("EL MAYOR ES : " + mayor);
        } else if (num1< num2) {
            mayor = num2;      
            System.out.println("EL MAYOR ES : " + mayor);
        } else {
            System.out.println("LOS NUMEROS SON IGUALES: " + num1 + " ES IGUAL A " + num2);
        }
        
        
        
    }
    
}
