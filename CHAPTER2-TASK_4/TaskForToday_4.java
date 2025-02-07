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
public class TaskForToday_4 {
    public static void main(String[] args) {
        
        //TFT 4 (Chapter 2)
        
        String Name, Subject, ID;
        int Test1, Test2;
        
        Scanner read = new Scanner(System.in);
        
        //Suruh user masukkkan semua input:nama, ID, subject, test 1 mark ,test2 mark
        System.out.println("Enter your name: ");
        Name = read.nextLine();
        
        System.out.println("Enter your ID: ");
        ID = read.nextLine();
        
        System.out.println("Enter subject: ");;
        Subject = read.nextLine();
        
        System.out.println("Enter Test 1 mark (/100): ");
        Test1 = read.nextInt();
        
        System.out.println("Enter test 2 marks (/100): ");
        Test2 = read.nextInt();
        
        read.close();
        
        //formula nk kira markah purata
        //program ni tolong kirakan
        int Mark = (Test1 + Test2 )/2;
        System.out.println("Average Mark: " + ((Test1 + Test2) /2) + "/100");
        
    }
    
}
