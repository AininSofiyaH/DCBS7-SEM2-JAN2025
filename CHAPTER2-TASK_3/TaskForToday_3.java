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
public class TaskForToday_3 {
    
    public static void main(String[] args) {
        
        //TFT 3 (Chapter 2)
        
        int tahun_semasa, tahun_lahir;    //declare dulu dia data type apa
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("Enter tahun semasa: ");
        tahun_semasa = read.nextInt();   //supaya user boleh masukkan input
        System.out.println("Enter tahun lahir: ");
        tahun_lahir = read.nextInt();    //supaya user boleh masukkan input
        
        read.close();
        
        int age = tahun_semasa - tahun_lahir;    //formula nk kira umur
        System.out.println("Age:\n" +tahun_semasa + " - " +tahun_lahir + " = " + (age));
        System.out.println("You are " +age + " years old");
        
    }
    
}
