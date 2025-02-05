/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chapter2;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class ArithmeticProg {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai pertama: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Masukkan nilai kedua: ");
        int num2 = scanner.nextInt();
        System.out.println("\n Hasilnya :");
        
        int sum = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + sum);
        
        int difference = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + difference);
        
        int product = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + product);
        
        int division =  num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + division);
            
            int modulus = num1 % num2;
            System.out.println(num1 + " % " + num2 + " = " + modulus);
            
    }
    
}
