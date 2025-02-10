/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter3;
import java.util.Scanner;
/**
 *
 * @author Fatihah
 */
public class TaskForToday_1 {

    
    public static void main(String[] args) {
        
        //TFT 1 (chapter 3)

        int grade;
        Scanner read = new Scanner(System.in);
        
        //user masukkan markah dia
        System.out.println("Enter your mark");
        grade = read.nextInt();

        if (grade >= 80)   //kna bgtau syarat
            System.out.println("Excellent!! \nYou got A");
            //print klu markah dia lebih atau sama dgn 80
            
        else if (grade >= 60)    //kna bgtau syarat
            System.out.println("Good Job! \nYou got B");
            //print klu markah dia lebih atau sama dg 60
        
        else      //x yah bgtau sbb dia selain dua yg atas tu
            System.out.println("Please study more. \nYou FAIL");
             //print klu markah dia kurang dari 60 
    }
}
