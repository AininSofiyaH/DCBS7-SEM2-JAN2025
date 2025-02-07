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
public class NewClass {
    
    public static void main(String[] args) {
        
        
         // TFT 1 (Chapter 2)
        
        int num1;
        int num2;     //declare data type apa
       
        Scanner read = new Scanner(System.in);
        System.out.println("please enter 1st number: ");
        num1 = read.nextInt();
        System.out.println("please enter 2nd  number: ");
        num2 = read.nextInt();

        read.close();
        
        int tambah = num1 + num2;    //formula
        System.out.println("Tambah:" +num1 + "+" +num2 + "=" + (num1 + num2) );
        int tolak = num1 - num2;    //^ klua nom 1st yg user masukkan
        System.out.println("Tolak:" +num1 + "-" +num2 + "=" + (num1 - num2));
        int darab = num1 * num2;               //^ klua nom 2nd yg user masukkan 
        System.out.println("Darab:" +num1 + "x" +num2 + "=" + (num1 * num2));
        int bahagi = num1 / (num2 * num2);                             //^ klua hasil dia         
        System.out.println("bahagi:" +num1 + "/" +num2 + "=" + (num1 / num2));
        
    
}
}
