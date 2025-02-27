/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task.pkg6;

/**
 *
 * @author adria
 */
import java.util.Scanner;
public class Task6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic hereimport java.util.Scanner;
         
         Scanner body = new Scanner(System.in);
         
         System.out.print("Please enter your weight in kilogram (KG): ");
         double weight = body.nextDouble();
         
         System.out.print("Please enter your height in centimeter (CM): ");
         double height = body.nextDouble();
         
          double bmi = weight / (height * height);
         
         System.out.println("\n===== BMI Results =====");
         System.out.println("Weight: " + weight + "KG");
         System.out.println("Height: " + height + "CM");
          

     }
}

        
    
