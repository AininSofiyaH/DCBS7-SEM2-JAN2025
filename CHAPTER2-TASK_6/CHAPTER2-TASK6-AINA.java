/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package customer.requirement1;
import java.util.Scanner;
/**
 *
 * @author aina
 */

public class task6 {
     public static void main(String[] args){
         
         Scanner Baca = new Scanner(System.in);
         
         // intruction masukkan value for weight,height user
         System.out.print("Enter your weight in kilogram (KG): ");
         double berat = Baca.nextDouble();
         
         System.out.print("Enter your height in centimeter (CM): ");
         double tinggi = Baca.nextDouble();
         
         double bmi = berat / (tinggi * tinggi); //formula bmi
         
         //print results for berat,tinggi dan Bmi
         System.out.println("\n===== BMI Results =====");
         System.out.println("Berat: " + berat + "KG");
         System.out.println("Tinggi: " + tinggi + "CM");
         System.out.println("Bmi" + " = " + bmi);
         
         Baca.close();
          

     }
}

