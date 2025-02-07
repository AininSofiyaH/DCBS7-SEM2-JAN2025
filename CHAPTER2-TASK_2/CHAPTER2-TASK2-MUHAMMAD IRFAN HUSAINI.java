/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
public class Task2 {
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        
        System.out.print("Enter your name:");
        String name = input.nextLine();
       
        System.out.print("Enter you age:");
        String age = input.nextLine();
        
        System.out.print("Enter your hobby:");
        String hobby = input.nextLine();
        
        System.out.print("Enter your favorite food:");
        String favorite_food = input.nextLine();
        
        System.out.println("=========================");
        System.out.println("User information:");
        System.out.println("name:" + name);
        System.out.println("age:" + age);
        System.out.println("hobby:" + hobby);
        System.out.println("favorite food:" + favorite_food);  
  }
}
