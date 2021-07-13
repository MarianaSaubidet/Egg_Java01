/*
 * Escribir un programa que lea un número entero por teclado y muestre por 
 * pantalla el doble, el triple y la raíz cuadrada de ese número. 
 * Nota: investigar la función Math.sqrt().
 */
package parte01;

import java.util.Scanner;
public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in, "ISO-8859-1").useDelimiter("\n");
        
        int num;
        System.out.println("INGRESE UN NUMERO: ");
        num = leer.nextInt();
        System.out.println("EL DOBLE DE " + num + " ES: " + (num*2));
        System.out.println("EL TRIPLE DE " + num + " ES: " + (num*3));
        System.out.println("LA RAIZ CUADRADA DE " + num + " ES: " + ((int)Math.sqrt(num)));
        System.out.println("LA RAIZ CUADRADA DE " + num + " ES: " + (Math.sqrt(num)));
    }
    
}
