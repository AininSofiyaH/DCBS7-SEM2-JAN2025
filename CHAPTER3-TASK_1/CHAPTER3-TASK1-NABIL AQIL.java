package javaapp;

import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        //Making "goat" into a scanner
        Scanner goat = new Scanner(System.in);
        
        //Input for the final mark
        System.out.print("Enter your final mark : ");
        int mark = goat.nextInt();
        
        //If-else for grading
        if (mark >= 90){
            System.out.println("Congrats! You got an A!");
        } else if (mark >= 70){
            System.out.println("You got a B. Excellent!");
        } else if (mark >= 60){
            System.out.println("You got a C. Well done!");
        } else if (mark >= 50){
            System.out.println("You got a D. Good job!");
        } else {
            System.out.println("That's an F! Do better!");
        }
    }
}
