/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arithmeticprog;

import java.util.Scanner;
public class Task5 {
 public static void main(String[] args){   
    Scanner input = new Scanner(System.in);

System.out.print("Enter item name: ");
String item_name = input.nextLine();

System.out.print("Enter item price: ");
Double sum1 = input.nextDouble();

System.out.print("Enter item quantity: ");
int sum2 = input.nextInt();

System.out.print("Enter item discount rate: ");
Double sum3 = input.nextDouble();

System.out.println("=================== ");
System.out.println("Item information: ");
System.out.println("Item name: " + item_name);
System.out.println("Item price: " + sum1);
System.out.println("Item quantity: " + sum2);
System.out.println("Total price: " + (sum1 * sum2));
System.out.println("Discount rate: " + (sum3 / 100));
System.out.println("Price after discount: " + ((sum1 * sum2)-(sum3/100)) );



 }
}
