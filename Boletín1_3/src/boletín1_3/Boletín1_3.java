/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletín1_3;
import java.util.Scanner;
/**
 *
 * @author sgomezpintos
 */
public class Boletín1_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     double cantidad1;
     double cantidad2;
     double valorEurovsDolar= 1.15;
     double valorDolarvsEuro= 0.87;
     Scanner ler = new Scanner(System.in);    
     System.out.println("Pasar de Dólar a Euro");
      cantidad1=ler.nextDouble();
     System.out.println("Son "+(cantidad1*valorEurovsDolar)+" Euros");
     System.out.println("Pasar de Euro a Dólar");
     cantidad2=ler.nextDouble();
     System.out.println("Son "+(cantidad2*valorDolarvsEuro)+" Dólares");
     
          
     
    }
    }

