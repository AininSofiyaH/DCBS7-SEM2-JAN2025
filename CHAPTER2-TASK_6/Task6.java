/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chapter2;

/**
 *
 * @author Asus
 */
import java.util.Scanner;
public class Task6 {
     public static void main(String[] args){
         
         Scanner badan = new Scanner(System.in);
         
         System.out.print("Tolong masukkan berat dalam kilogram (KG): ");
         double berat = badan.nextDouble();
         
         System.out.print("Tolong masukkan tinggi dalam centimeter (CM): ");
         double tinggi = badan.nextDouble();
         
         double bmi = berat / (tinggi * tinggi);
         
         System.out.println("\n===== BMI Results =====");
         System.out.println("Berat: " + berat + "KG");
         System.out.println("Tinggi: " + tinggi + "CM");
          

     }
}
