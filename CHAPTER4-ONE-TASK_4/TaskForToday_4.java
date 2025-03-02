/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter.pkg4;

/**
 *
 * @author Fatihah
 */
public class TaskForToday_4 {
    public static void main(String[] args) {
        
        int result, sum;  //declare variable
        
        sum = 0;
        for(int i = 1; i <= 10; i++){
            result = square(i);      //calling method   //i is parameter(bnda yg kite nk pass)
                    
            System.out.println("The square of " +i +" is = " +result );          //untuk square
            sum += result;
        }
    System.out.println("\nThe sum is: " +sum);}
    
    
    public static int square(int y){     //i tuka jadi y
        return y * y;
    }
    // cari sum for the power of 2 je
    
    }

