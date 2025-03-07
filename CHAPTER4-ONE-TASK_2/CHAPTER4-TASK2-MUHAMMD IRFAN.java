/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tasklooping1;

/**
 *
 * @author irfan
 */
public class TaskLooping2 {
    public static void main(String[] args){
        
        System.out.println("while loop ");
    int OutputFor = 0; // variable bagi simpan data
    for (int i = 1; i <= 10 ; i++){ 
        OutputFor += 1;  
        System.out.print(" the number : "+ i  ); // printkan setiap hasil 
    }
        System.out.println(" the total is :" + OutputFor);//printkan total hasil
        
        System.out.println("while loop ");
    int OutputWhile = 0; // variable bagi simpan data 
    int a = 1; 
    while ( a <= 10){ 
        OutputWhile += 1;
        System.out.print(" the number is: " + a );
        a++;
        
    }
        System.out.println("the total is :" + OutputWhile);
    
        System.out.println("For loop ");
    int OutputDoWhile = 0;
    int b = 1;
    do{
        OutputDoWhile += 1;
        System.out.print("the number is:" + b);
        b++;
    }while (b <= 10);
    System.out.println("total number is :" + OutputDoWhile); 
    
    }
    
}