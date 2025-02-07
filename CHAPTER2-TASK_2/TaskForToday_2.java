/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication6_chapter.pkg2.task.pkgfor.today;
import java.util.Scanner;

/**
 *
 * @author Fatihah
 */
public class TaskForToday_2 {
    
    public static void main(String[] args) {
        
        // TFT 2 (Chapter 2)
        
        String Name, hobby, favorite_food;
        int age;              //declare dia data type apa
       
        Scanner read = new Scanner(System.in);
        
        System.out.println("Insert your Name: ");
        Name = read.nextLine();  //baca user input
        
        System.out.println("Insert your Age: ");
        age = read.nextInt();    //nextInt sbb age tu nombor @ int
        read.nextLine();
                
        
        System.out.println("Insert your Hobby: ");
        hobby = read.nextLine();    //nextLine sbb hobby tu string
        
        System.out.println("Inser your Favorite food: ");
        favorite_food = read.nextLine();

        read.close();
        
    }
}
