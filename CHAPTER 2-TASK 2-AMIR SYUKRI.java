/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject3;

import java.util.Scanner;

/**
 *
 * @author amird
 */
public class Mavenproject3 {

    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);

        System.out.print("Sila Masukkan Nama Anda : ");
        String name = sc.nextLine();

        System.out.print("Sila Masukkan Umur Anda : ");
        int age = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Sila Masukkan Hobi Anda : ");
        String hobby = sc.nextLine();

        System.out.print("Sila Masukkan Makanan Kegemaran Anda : ");
        String food = sc.nextLine();

        System.out.println("\nMaklumat Pengguna:");
        System.out.println("Nama: " + name);
        System.out.println("Umur: " + age);
        System.out.println("Hobi: " + hobby);
        System.out.println("Makanan Kegemaran: " + food);

        sc.close();
        
        
    }
}
