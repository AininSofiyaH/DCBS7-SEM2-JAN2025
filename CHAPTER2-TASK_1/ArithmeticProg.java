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
public class ArithmeticProg {
    public static void main(String[] args) {
        
    Scanner kereta = new Scanner(System.in);
    System.out.print("Masukkan Nilai Pertama: ");
    int num1 = kereta.nextInt();
    
    System.out.print("Masukkan Nilai Kedua: ");
    int num2 = kereta.nextInt();
    System.out.println("\n Hasilnya: ");
    
    int sum = num1 + num2;
    System.out.println(num1 + " + " + num2 + " = " + sum);
    
    int difference = num1 - num2;
    System.out.println(num1 + " - " + num2 + " = " + difference);
    
    int product = num1 * num2;
    System.out.println(num1 + " * " + num2 + " = " + product);
    
    int division = num1 / num2;
    System.out.println(num1 + " / " + num2 + " = " + division);
    
    int modulus = num1 % num2;
    System.out.println(num1 + " % " + num2 + " = " + modulus);
    } 
}
