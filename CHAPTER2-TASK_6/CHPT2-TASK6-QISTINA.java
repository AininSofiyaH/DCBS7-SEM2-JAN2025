/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taskfortoday6;
import java.util.Scanner;

/**
 *
 * @author qistina
 */
public class TaskForToday6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double weight, height; 
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("BMI Calculation");
        
        System.out.println("Insert your weight: ");
        weight = read.nextInt();
        System.out.println("Insert your height: ");
        height = read.nextInt();
        
        read.close();
        
        double BMI = weight / (height * height);
        System.out.println("BMI = " + (weight / (height * height)));
        
    }
    
}
