/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chapter2;

/**
 *
 * @author Adam
 */
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter your name: ");
        String nama = scanner.nextLine();
        
        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();
        
        scanner.nextLine();
        
        System.out.print("Please enter your hobby: ");
        String hobby = scanner.nextLine();
        
        System.out.print("Please enter your favorite food: ");
        String favoriteFood = scanner.nextLine();
        
        System.out.println("\n --- PERSONAL INFORMATION --- ");
        System.out.println("Name:" + nama);
        System.out.println("Age:" + age);
        System.out.println("Hobby:" + hobby);
        System.out.println("Favorite Food:" + favoriteFood);
    }
    
}
