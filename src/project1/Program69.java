/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;
import javax.swing.JOptionPane;

/**
 *
 * @author Tahsi
 */
public class Program69 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           int w;
        int a;
        String first;
        w = 1;
       do{
         first = JOptionPane.showInputDialog("input list");
          a = Integer.parseInt(first);
          first = "The value entered is " + a;
          JOptionPane.showMessageDialog(null, first);
          System.out.println(a);
          w++;
        }while(w<=7);
        
        // TODO code application logic here
    }
    
}
