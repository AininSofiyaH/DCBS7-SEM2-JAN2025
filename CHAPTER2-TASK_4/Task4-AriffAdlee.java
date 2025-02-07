/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task4averagemarks;

/**
 *
 * @author User
 */
import javax.swing.JOptionPane;
public class Task4AverageMarks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String Name;
        int ID;
        String Subject;
        int Test1;
        int Test2;
        
        Name = JOptionPane.showInputDialog("Enter your name");
        ID = Integer.parseInt(JOptionPane.showInputDialog("Enter your ID"));
        Subject = JOptionPane.showInputDialog("Enter your subject");
        do {
            Test1 = Integer.parseInt(JOptionPane.showInputDialog("Enter your marks for Test 1"));
            if (Test1 < 0 || Test1 > 100){
                JOptionPane.showMessageDialog(null, "Invalid input! Please enter a number between 1 - 100");
            }
        }while (Test1 < 0 || Test1 > 100);
        
        do{
            Test2 = Integer.parseInt(JOptionPane.showInputDialog("Enter your marks for Test 2"));
            if (Test2 < 0 || Test2 > 100){
            JOptionPane.showMessageDialog(null, "Invalid input! Please enter a number between 1 - 100");
        }
        }while (Test2 < 0 || Test2 > 100);
        
        double average = (Test1 + Test2) / 2.0;
        
        String message = "Student Information:\n";
        message += "Name: " + Name + "\n";
        message += "ID: " + ID + "\n";
        message += "Subject: " + Subject + "\n";
        message += "Test 1 Marks: " + Test1 + "\n";
        message += "Test 2 Marks: " + Test2 + "\n";
        message += "Average Marks: " + average;
        
        JOptionPane.showMessageDialog(null, message); 
       
    }
    
}
