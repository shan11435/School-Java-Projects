/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;
import javax.swing.JOptionPane;

/**
 *
 * @author Tahsi
 */
public class Program19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            @SuppressWarnings("empty-statement")
        double a = 0;
        double b = 0;
        double c = 0;
        double d;
        double x;
        double x1;
        double x2;
        System.out.println("Welcome to quadratic equation");
        String first;
        first = JOptionPane.showInputDialog("Enter value for a");
        String second;
        second = JOptionPane.showInputDialog("Enter value for b");
        String third;
        third = JOptionPane.showInputDialog("Enter valoue for c");
        
 
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
        // TODO code application logic here
    }
        }
    }
}
