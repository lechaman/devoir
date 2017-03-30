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
 
public class Exo2 {
    
     public static void main(String[] args) {
       Scanner user_input= new Scanner(System.in) ;
          int compteur=1,test;
          
    System.out.print("entrer le nombre que voulais lister les nombres premier inferieur ou egal a ce nombre:");
    // lecture au clavier qui manque
     int nombre = Integer.parseInt(user_input.nextLine()); 
System.out.println("");  
System.out.print("resultat:");
       while (nombre >= compteur){
           test= compteur%2 ;
          if (test!=0) {
               System.out.print(compteur +",");
           }
               
           compteur+=1;
       }
     
     }
}
