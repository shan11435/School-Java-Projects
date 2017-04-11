/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project1;
import javax.swing.JOptionPane;

/**
 *
 * @author class
 */
public class Program15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String first;
        first = JOptionPane.showInputDialog("Enter the first number");
        String second;
        second = JOptionPane.showInputDialog("Enter the second number");
        int a = Integer.parseInt(first);
        int b = Integer.parseInt(second);
        if (a>b)
            System.out.println(a + " is greater");
        else if(a<b)
            System.out.println(a + "is greater than " + b);
        else 
            System.out.println("They're equal");
        
        
        
        
        
        
        // TODO code application logic here
    }
    
}
