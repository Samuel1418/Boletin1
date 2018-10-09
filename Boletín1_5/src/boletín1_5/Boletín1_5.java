/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletín1_5;
import java.util.Scanner;

/**
 *
 * @author sgomezpintos
 */
public class Boletín1_5 {

  
    
    public static void main(String[] args) {
        // TODO code application logic here
          double millas;
      double m1=1852;
    Scanner ler = new Scanner(System.in);
    System.out.print("Introduzca millas para pasar a metros");
    millas = ler.nextDouble();
    System.out.println((millas*m1)+" metros");
     
    }
    
}
