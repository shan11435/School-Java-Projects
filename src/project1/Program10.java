package project1;
import javax.swing.JOptionPane;

public class Program10 {
    public static String breakline = System.getProperty("line.separator");
    public static void main(String[] args) {
        String first_name;
        first_name = JOptionPane.showInputDialog("What is your first number");
        int n1 = Integer.parseInt( first_name );

        String family_name;
        family_name = JOptionPane.showInputDialog("What is your second number");
        int n2 = Integer.parseInt( family_name );
        int sum = n1 + n2;
        int differance = n1 - n2;
        int product = n1 * n2;
        int quotient = n1 / n2;
        String full_name;
        full_name = "The sum is " + sum + breakline + " The differance is " + differance + breakline + " The product is " + product + breakline + " The quotient is " + quotient;
        JOptionPane.showMessageDialog( null, full_name);
    }   
}