/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter.pkg4;

/**
 *
 * @author User
 */
public class TaskForToday_1 {
    public static void main(String[] args) {
        
    
        //for statement
        
        System.out.println("\n");
        System.out.println("for loop");
        System.out.println("Printing Numbers from 1 to 10");
        int count;
        for(count = 1; count <= 10; count++){              //baca semua syntax dulu baru print 
            System.out.println(count);                     //pastu baru ulang (selagi count tu less than 10
        }
        
    
        //while statement
       
        System.out.println("\n");
        System.out.println("while loop");
        System.out.println("Printing Numbers from 1 to 10");
        count = 1;
        while(count <= 10){                          //print semua nombor yg <= 10
            System.out.println(count++);             //count++ tu punca nom tu bertambah
        }
    
    
    
    //do while statement
        
        System.out.println("\n");
        System.out.println("do while loop");
        System.out.println("Printing Numbers from 1 to 10");
        count = 1;
        do{                                               //apa yg dia kna buat
            System.out.println(count++);}                 //tambah 1 dekat count
        while(count <= 10);                               //selagi count tu <=10
        
        
        
    }  
}
