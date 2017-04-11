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
public class program13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = Integer.parseInt(JOptionPane.showInputDialog("Enter a value"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Enter another value"));
        
        
        String answer1,answer2;
        answer1=(a+" is greater ");
        answer2=(b+" is greater ");
        
        if (a>b)
            JOptionPane.showMessageDialog(null, answer1);
        else
            JOptionPane.showMessageDialog(null, answer2);
    }
    
}
