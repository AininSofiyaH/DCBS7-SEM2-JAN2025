/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package userinformation;
import java.util.Scanner;
/**
 *
 * @author sammy
 */
public class UserInformation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String name, hobby, favourite_food;
    int age;
    
    Scanner read = new Scanner(System.in);
    
    System.out.println("PLEASE ENTER YOUR NAME : "); //instruction for user
    name = read.nextLine(); //read user's input
    System.out.println("PLEASE ENTER YOUR HOBBY : ");
    hobby = read.nextLine();
    System.out.println("PLEASE ENTER YOUR FAVOURITE FOOD");
    favourite_food = read.nextLine();
    System.out.println("PLEASE ENTER YOUR AGE : ");
    age = read.nextInt();
    
    read.close(); 
    
    System.out.println("NAME : " +name); //display user information
    System.out.println("HOBBY : " +hobby);
    System.out.println("FAVOURITE FOOD : " +favourite_food);
    System.out.println("AGE : " +age);
    
    }}