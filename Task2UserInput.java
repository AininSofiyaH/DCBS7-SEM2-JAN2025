/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


package task2userinput;



/**
 *
 * @author User
 */
import java.util.Scanner;
public class Task2UserInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name;
        String hobby;
        String favouritefood;
        int age;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter your name: ");
        name = in.nextLine();
        System.out.println("Enter your age: ");
        age = in.nextInt();
        in.nextLine();
        System.out.println("Enter your hobby: ");
        hobby = in.nextLine();
        System.out.println("Enter your favourite food: ");
        favouritefood = in.nextLine();
        
        System.out.println("--- User Details ---");
        System.out.println("Your name is " +name);
        System.out.println("You are "+age);
        System.out.println("Your hobby is " +hobby);
        System.out.println("Your favourite food is " +favouritefood);
    
        
        
      
    }
    
}
