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
public class Program52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a;
      
       
        for (int w = 1; w<=7; w++){
        String first;
        first = JOptionPane.showInputDialog("input list");
        a = Integer.parseInt(first);
        first = "The value entered is "+a;
        JOptionPane.showMessageDialog( null, first);
        System.out.println(a);
        }
        // TODO code application logic here
    }
    
}
