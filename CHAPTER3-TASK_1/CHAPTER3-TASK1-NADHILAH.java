/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package finalmark;

/**
 *
 * @author Habriyah
 */
import java.util.Scanner;

public class FinalMark {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        // Input
        System.out.print("Enter your marks: ");
        int marks = read.nextInt();
        
        // Determine grade
        String grade;
        String message;
        
        if (marks >= 90) {
            grade = "A";
            message = "CONGRATSSSS!!!!";
        } else if (marks >= 80) {
            grade = "B";
            message = "Good job! Keep it up!";
        } else if (marks >= 70) {
            grade = "C";
            message = "Nice! But you can do better!";
        } else if (marks >= 60) {
            grade = "D";
            message = "Not bad, but work harder next time!";
        } else {
            grade = "F";
            message = "Don't give up! Try again!";
        }
        
        // Output
        System.out.println("Your Grade: " + grade);
        System.out.println(message);
        
        read.close();
    }
}

