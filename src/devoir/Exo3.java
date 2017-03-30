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
public class Exo3 {
    
   public static void main(String[] args) {
       Scanner user_input= new Scanner(System.in);
       
       int reste;
       String reponse=" ";
       
       System.out.print("entrer la valeur qu'il faut convertir en binaire:");
       // lecteur au clavier
       int valeur = Integer.parseInt(user_input.nextLine()); 
       System.out.println();
         while (valeur !=0 ){
             reste= valeur%2;
             reponse+= reste;
             valeur= valeur/2;
            
         }
         
          String reverse = new StringBuffer(reponse).reverse().toString();
         System.out.println("la valeur binaire est:"+ reverse);
         
   }
    
}

