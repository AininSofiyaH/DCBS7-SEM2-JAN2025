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
public class Task1 { 
    public static void main(String[] args) {
        Scanner kereta = new Scanner(System.in);

        System.out.print("Masukkan Nama Anda: ");
        String name = kereta.nextLine();
        
        System.out.print("Masukkan Umur Anda: ");
        int age = kereta.nextInt();

        kereta.nextLine();

        System.out.print("Masukkan Hobi Anda: ");
        String hobby = kereta.nextLine();

        System.out.print("Masukkan Makanan Kesukaan Anda: ");
        String favoriteFood = kereta.nextLine();

        System.out.println("\n=== Informasi Anda ===");
        System.out.println("Nama: " + name);
        System.out.println("Umur: " + age + " Tahun");
        System.out.println("Hobi: " + hobby);
        System.out.println("Makanan Favorit: " + favoriteFood);
    }
}

