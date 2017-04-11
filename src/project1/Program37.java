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
public class Program37 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int w;
        int a;
        w = 1;
        System.out.println("Enter the list of numbers");
        while (w<=7)
        { Scanner k = new Scanner(System.in);
          a = k.nextInt();
          if (a>=8 & a<=12)
              System.out.println(a);
          w++;
        }
    }
}
