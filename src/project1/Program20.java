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
public class Program20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a;
        System.out.println("Enter a number");
        Scanner k = new Scanner(System.in);
        a = k.nextInt();
        if (a==5)
           System.out.println("Five");
        else if (a==7)
            System.out.println("seven");
          else if (a==3)
             System.out.println("three");
          else 
              System.out.println("none");
        // TODO code application logic here
    }
    
}
