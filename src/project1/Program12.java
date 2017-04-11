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
public class Program12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a;
        int b;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the firat number");
        a = keyboard.nextInt();
        System.out.println("Enter the second number");
        b = keyboard.nextInt();
        
        
        
        if(a > b)
        {      
            System.out.println(a + " is greater ");
        }
        else {        
            System.out.println(b + " is greater ");
        }
    }
}