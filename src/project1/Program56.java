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
public class Program56 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int a;  
        System.out.println("Enter the following list");
           for (int w = 1; w<=7; w++){
           Scanner k = new Scanner(System.in);
           a = k.nextInt();
           if (w!=2 & w!=3 & w!=4 & w!=5 & w!=6){
           System.out.println(a);}
        }
        // TODO code application logic here
    }
    
}
