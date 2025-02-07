/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject4;

import java.util.Scanner;

/**
 *
 * @author amird
 */
public class Mavenproject4 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your birth year: ");
        int birthYear = sc.nextInt();

        System.out.print("Enter the current year: ");
        int currentYear = sc.nextInt();

        int age = currentYear - birthYear;

        System.out.println("\nYou are " + age + " years old.");

        sc.close();
    }
}
