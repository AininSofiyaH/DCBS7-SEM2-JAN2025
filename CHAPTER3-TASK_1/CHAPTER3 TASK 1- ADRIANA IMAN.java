/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task.pkg1.week.pkg3;

/**
 *
 * @author adria
 */
 import java.util.Scanner;
public class Task1Week3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Scanner coco = new Scanner(System.in);
        // enter the user's mark
        System.out.print("Enter the score: ");
        int mark = coco.nextInt();
        
        String grade;
        if (mark >= 70) {
            grade = "A";
        } else if (mark >= 60) {
            grade = "B";
        } else if (mark >= 50) {
            grade = "C";
        } else if (mark >= 45) {
            grade = "D";
        }else if (mark >= 40) {
            grade = "E";
        } else {
            grade = "F";
        }  
            System.out.println("Your grade is: " + grade);
        }
    }
    
    