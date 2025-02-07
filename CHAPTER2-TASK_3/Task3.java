/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task3;

/**
 *
 * @author User
 */
import javax.swing.JOptionPane;
public class Task3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String TheYearYouWereBorn;
        String TheCurrentYear;
        int num1, num2, birthyear;
        
        TheYearYouWereBorn = JOptionPane.showInputDialog("Enter the year you were born.");
        TheCurrentYear = JOptionPane.showInputDialog("Enter the current year.");
        
        num1 = Integer.parseInt(TheYearYouWereBorn);
        num2 = Integer.parseInt(TheCurrentYear);
        
        birthyear = num2 - num1;
        
        JOptionPane.showMessageDialog(null, "Your age is "+birthyear, "Results",   JOptionPane.PLAIN_MESSAGE);
        
        
    }
    
}
