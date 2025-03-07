/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tasklooping1;

/**
 *
 * @author irfan
 */
public class TaskLooping4 {
    public static void main(String[] args){
        
    int output = 0;
    System.out.println("power  of 2 for numbers from 1 to 10 is :");
      for (int i = 1; i <= 10; i++) {
          int powerof2 = i * i; 
          System.out.println(i + " power of 2 is = " + powerof2 ); 
          output += powerof2; 
    }
    System.out.println("\nTotal sum power of 2 is : " + output); 
  }
}
