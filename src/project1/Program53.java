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
public class Program53 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a;
        int sum = 0;
        System.out.println("Enter the following list");
        for (int w = 1; w<=7; w++){
            Scanner k = new Scanner (System.in);
            a = k.nextInt();
            sum = sum + a;
           }
            System.out.println("The sum of the following list is " + sum); 
        // TODO code application logic here
    }
    
}
