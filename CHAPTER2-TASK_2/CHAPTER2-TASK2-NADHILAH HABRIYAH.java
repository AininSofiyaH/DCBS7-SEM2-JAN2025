/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package personal.information;

/**
 *
 * @author Habriyah
 */
import java.util.Scanner;

public class personalinformation{
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        // Prompting user for Enter name
        System.out.print("Enter your name: ");
        String name = read.nextLine();
        
        System.out.print("Enter your age: ");
        int age = read.nextInt();
        scanner.nextLine();  // Consume the newline
        
        System.out.print("Enter your hobby: ");
        String hobby = read.nextLine();
        
        System.out.print("Enter your favorite food: ");
        String favoriteFood = read.nextLine();
        
        // Displaying the user’s input
        System.out.println("\n--- User Information ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Hobby: " + hobby);
        System.out.println("Favorite Food: " + favoriteFood);
        
        read.close();
    }
}
