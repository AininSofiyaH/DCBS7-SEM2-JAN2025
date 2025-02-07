/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taskfortoday2;
import java.util.Scanner;

/**
 *
 * @author qistina
 */
public class TaskForToday2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String Name, hobby, favorite_food;
        int age;              
       
        Scanner read = new Scanner(System.in);
        
        System.out.println("Insert your Name: ");
        Name = read.nextLine();  
        
        System.out.println("Insert your Age: ");
        age = read.nextInt();    
        read.nextLine();
                
        
        System.out.println("Insert your Hobby: ");
        hobby = read.nextLine();    
        
        System.out.println("Insert your Favorite food: ");
        favorite_food = read.nextLine();

        read.close();
    }
    
}
