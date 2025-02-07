/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task.pkg2;
import java.util.Scanner;
/**
 *
 * @author aina
 */
public class TASK2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Baca = new Scanner(System.in);
        
        System.out.print("Enter nama: "); //instruction untuk enter nama
        String name = Baca.nextLine();
        
        System.out.print("Enter umur: "); //instruction untuk enter umur
        int age = Baca.nextInt();
        
        Baca.nextLine(); 
        
        System.out.print("Enter hobi: "); //instruction untuk enter hobi
        String hobby = Baca.nextLine();
        
        System.out.print("Enter favourite food awak: "); //instruction untuk enter fav food
        String favoriteFood = Baca.nextLine();
        
        // Display input yang diisi user dengan lebih teratur
        System.out.println("\n ---Maklumat Pengguna--- ");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Hobby: " + hobby);
        System.out.println("Favorite Food: " + favoriteFood);
        
        Baca.close();
     }
    
     }
    
    
