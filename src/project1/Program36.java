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
public class Program36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int w;
        int a;
        int sum;
        sum = 0;
        w = 1;
       System.out.println("Enter the list numbers");
       while (w<=7)
        { Scanner k = new Scanner (System.in);
          a = k.nextInt();
          sum = sum + a;
          w++;
        }
        System.out.println("The sum is " + sum);
    }
    
}
