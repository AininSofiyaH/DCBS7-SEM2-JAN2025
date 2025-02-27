/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task1looping;

/**
 *
 * @author aina
 */
public class Task1looping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //for statement
        
        System.out.println("Printing Numbers from 1 to 10");
        int count;
        for(count = 1; count <= 10; count++){        //start baca dari 1, based on syntax     
            System.out.println(count);                     
        }
        
    
        //while statement
       
        System.out.println("Printing Numbers from 1 to 10");
        count = 1;
        while(count <= 10){                          //print semua nombor yg less than 10
            System.out.println(count++);           
        }
    
    
    
    //do while statement
    
        System.out.println("Printing Numbers from 1 to 10");
        count = 1;
        do{                                            
            System.out.println(count++);}                 //tambah 1 dekat count
        while(count <= 10);                            
        
        
        
    }  

    
}
