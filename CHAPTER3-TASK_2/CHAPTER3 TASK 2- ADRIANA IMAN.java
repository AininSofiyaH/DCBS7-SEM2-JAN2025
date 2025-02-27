/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task2.week.pkg3;

/**
 *
 * @author adria
 */
import java.util.Scanner;
public class Task2Week3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 Scanner read = new Scanner(System.in);
 int choice;
 double num1, num2, result = 0;
            
   System.out.println("Select an arithmetic operations that you want to use");
   System.out.println("1. Addition(+)");
   System.out.println("2. Subtract(-)");
   System.out.println("3. Multiply(*)");
   System.out.println("4. Divide(/)");
   System.out.print("Please enter your selection: ");
   choice = read.nextInt();
            
   System.out.print("Enter two numbers: ");
   num1 = read.nextDouble();
   num2 = read.nextDouble();
            
    switch (choice) {
    case 1:
    result = num1 + num2;
    System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
    break;
                    
    case 2:
    result = num1 - num2;
    System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
    break;
                    
    case 3:
    result = num1 + num2;
    System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
    break;
                    
    case 4:
    if (num2 !=0) {
    result = num1 / num2;
    System.out.println("result: " + num1 + " / " + num2 + " = " + result);
    } else {
    System.out.println("ERROR!!");
    }
    break;
    default:
    System.out.println("Invalid choice, Please choose correctly");  
    }
 }
}
    
