/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletín1_4;
import java.util.Scanner;
/**
 *
 * @author sgomezpintos
 */
public class Boletín1_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     double num1;
     double num2;
     Scanner ler = new Scanner(System.in);
     System.out.println("Introduzca numeros a sumar");
     num1= ler.nextDouble();
     num2= ler.nextDouble();
     System.out.println("Suma "+(num1+num2)+"\nResta "+(num1-num2)+"\nMultiplicacion "+(num1*num2)+"\nDivisión "+(num1/num2));
     
    }
    
}
 