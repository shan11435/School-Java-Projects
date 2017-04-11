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
public class program22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char grade;
        int score;
        System.out.println("Enter a grade");
        Scanner k = new Scanner(System.in);
        score = k.nextInt();
        if (score >= 90)
            System.out.println("A");
        
        else if (score <=89)
            System.out.println("B");
       
        else if (score <= 70)
            System.out.println("C");
           
        else if (score <=60)
            System.out.println("D");
       
        else 
            System.out.println("F");
        
        
                
        
            
        
        // TODO code application logic here
    }
    
}
