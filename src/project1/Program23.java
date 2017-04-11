/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;
import java.util.Scanner;

/**
 *
 * @author Tahsi
 */
public class Program23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int score;
        System.out.println("Enter a score");
        Scanner k = new Scanner(System.in);
        score = k.nextInt();
        switch (score){
            case 85:
                System.out.println("B");
                break;
            case 90:
                System.out.println("A");
                break;
            case 70:
                System.out.println("C");
                break;
            case 60:
                System.out.println("D");
                break;
            default:
                System.out.println("none");
            
                 
        }
                
             
        
        // TODO code application logic here
    }
    
}
