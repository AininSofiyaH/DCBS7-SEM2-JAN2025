/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irfan;

import java.util.Scanner;
public class Task6 {
    public static void main(String[] args){
 Scanner output = new Scanner(System.in);
 
 System.out.print("Enter your weight in kilogram: ");
 Double weight = output.nextDouble();
 
 System.out.print("Enter your height in meter: ");
 Double height = output.nextDouble();
 
  Double BMI  = weight /(height * height);
  
  System.out.print("Your BMI is : " + BMI);
  
  if(BMI < 18.5){
      System.out.println("Category: underweight");
  } else if (BMI >= 18.5 && BMI < 24.9){
      System.out.println("Category : normal weight ");
  }else if (BMI >= 25 && BMI < 29.9){
      System.out.println("Category : normal weight ");
  } else {
      System.out.println("Category : normal weight ");
    }
  }
}

