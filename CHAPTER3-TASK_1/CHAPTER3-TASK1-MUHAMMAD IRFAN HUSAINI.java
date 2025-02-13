/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arithmeticprog;

import java.util.Scanner;
public class Task1 {
   public static void main(String[]args){
       Scanner output = new Scanner(System.in);
       
       System.out.print("Enter final mark : ");
       double finalMark = output.nextDouble();
       
       String grade;
       if (finalMark >= 80) grade = "A";
        else if (finalMark >= 70) grade = "B";
        else if (finalMark >= 60) grade = "C";
        else if (finalMark >= 50) grade = "D";
        else if (finalMark >= 40) grade = "E";
        else grade = "F";
       
       System.out.println("================");
       System.out.println("Your grade is: " + grade);
       System.out.println("================");
   } 
}
