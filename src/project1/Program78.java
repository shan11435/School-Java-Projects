/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project1;
import java.util.Scanner;
/**
 *
 * @author class
 */
public class Program78 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float a;
        float b;
        float x;
        int w;
        System.out.println("Do you have an equation?" + "Enter any number other than -999 if not enter -999");
        Scanner keyboard = new Scanner(System.in);
        w = keyboard.nextInt();
        while (w!=-999)
        { System.out.print("Enter a number ");
          a = keyboard.nextFloat();
          System.out.println("You entered " + a);
          System.out.println("Enter a second number ");
          b = keyboard.nextFloat();
          System.out.println("You entered " + b);
          
         if (a==0)
             if(b==0)
                 System.out.println("All solution");
             else 
                 System.out.println("no solution");
         else{
             System.out.println("one solution");
             x = -b/a;
             System.out.println("x= " + x);
             System.out.println("to stop enter -999 otherwise enter any other # ");
             w = keyboard.nextInt();
         }
        }
        
        // TODO code application logic here
    }
    
}
