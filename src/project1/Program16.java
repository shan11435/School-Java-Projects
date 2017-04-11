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
public class Program16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a;
        int b;
        System.out.println("Enter value for a");
        Scanner k = new Scanner(System.in);
        a = k.nextInt();
        System.out.println("Enter value for b");
        Scanner f = new Scanner(System.in);
        b = f.nextInt();
        if (a==0)
            if (b==0)
                System.out.println("all solution");
            else
                System.out.println("no solution");
        else
        {
            System.out.println("one solution");
            int x = -b/a;
            System.out.println(x);
        }
                    } 
}
    



