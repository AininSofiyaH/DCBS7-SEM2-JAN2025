/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arithmeticprog;

import java.util.Scanner;
public class CompoundProg {
  public static void main(String[]args){
      Scanner output = new Scanner(System.in);
      
      System.out.print("masukkan apa-apa nombor untuk a : ");
      int a = output.nextInt();
      int b = a, c = a, d = a;
      
      System.out.println("Pre-Increment (++a):" + (++a));
      System.out.println("Post-Increment (a++) :" + (b++));
      System.out.println("Nilai a selepas Post-Increment: " + b);
      System.out.println("Pre-Decrement (--a) :" + (--c));
      System.out.println("Post-Decrement (a--) :" + (d--));
      System.out.println("Nilai a selepas Post-Decrement: " + d);
      
      
      
  }  
}
