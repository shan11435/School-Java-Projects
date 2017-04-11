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
public class Program33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sum;
        int w;
        w = 5;
        sum = 0;
        while (w<=19)
        { 
            if (w%5==0)
            sum = sum + w;
             w++;
        }
        System.out.println("The sum of multiple of 5 from 1 to 19 = " + sum);
        // TODO code application logic here
    }
    
}
