/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

/**
 *
 * @author Tahsi
 */
public class Program67 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sum;
        int w;
        w = 1;
        sum = 0;
        do{ if(w%5==0){
            sum = sum + w;}
        w++;
        }while(w<=19); 
        System.out.println("The sum of multiple of 5 from 1 to 19 is " + sum);
        
        // TODO code application logic here
    }
    
}
