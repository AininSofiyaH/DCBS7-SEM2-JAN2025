/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.spg0453;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner kereta = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = kereta.nextLine();

        System.out.print("Enter ID: ");
        String id = kereta.nextLine();

        System.out.print("Enter Subject: ");
        String subject = kereta.nextLine();

        System.out.print("Enter Test1 marks (out of 100): ");
        double test1 = kereta.nextDouble();

        System.out.print("Enter Test2 marks (out of 100): ");
        double test2 = kereta.nextDouble();

        double average = (test1 + test2) / 2;

        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Subject: " + subject);
        System.out.println("Average Mark: " + average);
    }
}
