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
public class Program68 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a;
        int w;
        w = 1;
        System.out.println("Enter the following list");
        do { Scanner k = new Scanner(System.in);
            a = k.nextInt();
            System.out.println(a);
            w++;
        }while(w<=7);
        // TODO code application logic here
    }
    
}
