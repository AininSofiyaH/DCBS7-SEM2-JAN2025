/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task6bmicalculator;

/**
 *
 * @author User
 */
import javax.swing.JOptionPane;
public class Task6BMICalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double weight = Double.parseDouble(JOptionPane.showInputDialog("Enter your weight: "));
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height: "));
        
        double bmi = weight / (height * height);
        
        String category;
        if (bmi < 18.5){
            category = "Underweight";
        }else if (bmi < 24.9) {
            category = "Normal weight";
        }else if (bmi < 29.9) {
            category = "Overweight";
        } else {
            category = "Obese";
        }
        
        String message = "Your BMI is: " + String.format("%.2f", bmi
        ) + "\nCategory: " + category;
        JOptionPane.showMessageDialog(null, message);
    }
    
}
