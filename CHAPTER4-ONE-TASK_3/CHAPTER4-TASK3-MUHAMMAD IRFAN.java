/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tasklooping1;

/**
 *
 * @author irfan
 */
public class TaskLooping3 {
    public static void main(String[] args){
        
    int outputEven = 0;
    int outputOdd = 0;
        System.out.println("Even number :");
    for (int i = 1; i <=10; i++){
        if (i % 2 == 0){
            System.out.print(i +" ");
    }
            outputEven += i;
        }
    System.out.println("\nSum of even number :" + outputEven);
    
    System.out.println("\nOdd number :");
    for (int i = 1; i <= 10; i++){
        if (i % 2 != 0){
            System.out.print(i + " ");
            outputOdd += i;
      }
    }
    System.out.println("\nSum of odd number :" + outputOdd);
  }
}
