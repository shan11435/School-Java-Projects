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
public class Program18 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double d;
        double x;
        double x1;
        double x2;
        System.out.println("Welcome to quadratic equation");
        System.out.println("Enter value for a");
        Scanner first = new Scanner(System.in);
        a = first.nextDouble();
        System.out.println("Enter value for b");
        Scanner second = new Scanner(System.in);
        b = second.nextDouble();
        System.out.println("Enter value for c");
        Scanner third = new Scanner(System.in);
        c = third.nextDouble();
        if (a == 0)
        {
            if (b==0)
                if (c==0)
                System.out.println("all solution");
                else 
                System.out.println("no solution");
            else     
                { System.out.println("no solution");
                  x = -c/b;
                  System.out.println(x);
                }
        }
        else
        {
           d = b * b - 4 * a * c;
           if (d<0)
         { System.out.println("no solution");}
      else if (d==0)
    {     System.out.println("Duplicate Solution");
          x = -b/(2*a);
          System.out.println(x);}
           else 
          { x1 = -b + Math.sqrt(d)/(2*a);
            x2 = -b - Math.sqrt(d)/ (2*a);
            System.out.println(x1);
            System.out.println(x2);
          }
          
    
    
        }
    
        
        
       
        
        
        // TODO code application logic here
    }
    
}
