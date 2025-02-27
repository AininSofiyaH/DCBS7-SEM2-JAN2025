/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task.pkg4;

/**
 *
 * @author adria
 */
import java.util.Scanner;
public class Task4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner school = new Scanner(System.in);
        
        System.out.print("Enter the student's name: ");
        String name = school.nextLine();
        
        System.out.print("Enter the student's ID: ");
        String studentId = school.nextLine();
        
        System.out.print("Enter the subject: ");
        String subject = school.nextLine();
        
        
        System.out.print("Enter the marks for Test 1 (out of 100): ");
        double test1Marks = school.nextDouble();
        
        
        System.out.print("Enter the marks for Test 2 (out of 100): ");
        double test2Marks = school.nextDouble();
        
        
        double averageMarks = (test1Marks + test2Marks) / 2;
        
        
        System.out.println("\n--- Student Information ---");
        System.out.println("Name: " + name);
        System.out.println("ID: " + studentId);
        System.out.println("Subject: " + subject);
        System.out.println("Average Marks: " + averageMarks);
    }
}
    
    
