/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task;
import java.util.Scanner;
/**
 *
 * @author sufi
 */
public class Task {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input;
        input = new Scanner(System.in);
       
       System.out.print("Enter your name: ");
       String name = input.nextLine();
       
       System.out.print("Enter your age: ");
       int age = input.nextInt();
       input.nextLine();
       
       System.out.print("Enter your hobby: ");
       String hobby = input.nextLine();
       
       System.out.print("Enter your favourite food: ");
       String favfood = input.nextLine();
       
       System.out.println("\n====================");
       System.out.println("  USER INFORMATION  ");
       System.out.println("====================");
       System.out.println(" Name           : " + name);
       System.out.println(" Age            : " + age);
       System.out.println(" Hobby          : " + hobby);
       System.out.println(" Favourite Foos : " + favfood);
        System.out.println("====================");
        
        input.close();
    }
    
}
