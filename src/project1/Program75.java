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
public class Program75 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            int a;
            int w;
            w = 1;
          System.out.println("Enter the following list");
          do{Scanner k = new Scanner(System.in);
            a = k.nextInt();
            if (a==7){
              System.out.println(w);  
            w++;}
                if(w==7)
                    break;
       }while (w<=7);
        // TODO code application logic here
    }
    
}
