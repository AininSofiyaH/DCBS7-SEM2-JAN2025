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
public class Task2 { 
    public static void main(String[] args) {
        Scanner kereta = new Scanner(System.in);

        System.out.print("Masukkan Tahun Kelahiran Anda: ");
        int birthYear = kereta.nextInt();
        
        int currentYear = 2024;

        int age = currentYear - birthYear;

        System.out.println("\n=== Hasil Perhitungan ===");
        System.out.println("Tahun Kelahiran: " + birthYear);
        System.out.println("Tahun Sekarang: " + currentYear);
        System.out.println("Umur Anda: " + age + " tahun");
    }
}
