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
public class Program70 {
   
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int a;
    int sum;
    int w;
    sum = 0;
    w = 1;
    System.out.println("Enter the following list");
    do{ Scanner k = new Scanner(System.in);
        a = k.nextInt();
        sum = sum + w;
        w++;
    }while(w<=7);
     System.out.println("The sum is " + sum);
      } 
}
