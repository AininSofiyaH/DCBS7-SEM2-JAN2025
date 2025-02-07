/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arithmeticprog;

import java.util.Scanner;
public class Task4 {
    public static void main(String[] args){
 Scanner input = new Scanner(System.in);
 
 System.out.println("===============================");
 
 System.out.print("Enter your name: ");
 String name = input.nextLine();
    
 System.out.print("Enter your Student ID: ");
 String ID = input.nextLine();
 
 System.out.print("Enter your subject: ");
 String subject = input.nextLine();

    System.out.print("Enter test 1 score (out of 100): ");
 Double sum1 = input.nextDouble();
 
   System.out.print("Enter test 2 score (out of 100): ");
Double sum2 = input.nextDouble();
 
 System.out.println("------------------------------------ ");
 
System.out.println("Student name: " + name );
System.out.println("Student ID: " + ID );   
System.out.println("Student subject: " + subject );   
System.out.println("Student average mark: " + (sum1 + sum2) / 2 );

    
    }
}
