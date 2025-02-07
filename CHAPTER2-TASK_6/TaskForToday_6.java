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
public class TaskForToday_6 {
    
    public static void main(String[] args) {
        
        //TFT 6 (Chapter 2)
        
        double weight, height; 
        //double sbb weight ngn height ada perpuluhan
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("BMI Calculation");
        
        System.out.println("Insert your weight: ");
        weight = read.nextInt();
        System.out.println("Insert your height: ");
        height = read.nextInt();
        
        read.close();
        
        //formula kira BMI
        double BMI = weight / (height * height);
        System.out.println("BMI = " + (weight / (height * height)));
        
    }
    
 
}
