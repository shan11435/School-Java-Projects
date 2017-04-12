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
public class Program76 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int w;
    int a;
    int b;
    w = 1;
    while (w<=5)
    { System.out.println("Enter a value for a");
      Scanner k = new Scanner(System.in);
      a = k.nextInt();
      System.out.println("Enter a value for b");
      Scanner c = new Scanner(System.in);
      b = c.nextInt();    
      if (a==0)
        if (b==0)
          System.out.println("all solution");
        else 
            System.out.println("no solution");
      else 
      { 
          System.out.println("one solution");
          int x;
          x = -b/a;
          System.out.println("x= " + x);
      }
      w++;
    }
    }
}
