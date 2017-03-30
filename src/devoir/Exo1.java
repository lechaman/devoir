/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devoir;

/**
 *
 * @author Lechaman
 */
import java.util.Scanner;

public class Exo1 {
     public static void main(String[] args)
     {
     Scanner user_input= new Scanner(System.in) ;
     
     String mot;
         System.out.print("Entrer votre mots:");
         mot= user_input.next();
         String reverse = new StringBuffer(mot).reverse().toString();
         
         if (mot == null ? reverse == null : mot.equals(reverse)){
            
             System.out.println("Ce mots est un pallidrome");
         }
        else
         {
             System.out.println("Ce mots n'est pas un pallidrome");
         }
     
     
     }
    
    
}
