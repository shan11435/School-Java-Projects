/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project1;

/**
 *
 * @author class
 */
public class Program32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sum;
        int w;
        w = 1;
        sum = 0;
        while (w<=10)
        { sum = sum + w;
          w = w + 1;
        }
        System.out.println("The sum of 1 to 10 is " + sum);
        
        // TODO code application logic here
    }
    
}
