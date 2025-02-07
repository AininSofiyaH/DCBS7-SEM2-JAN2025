/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task4;
import java.util.Scanner;
/**
 *
 * @author aina
 */
public class task4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name, id, sub; //declare string yang ada
        int t1, t2; //declare integer
        
        Scanner read = new Scanner(System.in); //wajib ada kalau user kene masukkan input
        System.out.println("PLEASE ENTER YOUR NAME             : "); //intruction masukkan nama
        name = read.nextLine();
        System.out.println("PLEASE ENTER YOUR STUDENT ID       : "); //intruction masukkan id student
        id = read.nextLine();
        System.out.println("PLEASE ENTER YOUR SUBJECT          : "); //instruction masukkan subject
        sub = read.nextLine(); //
        System.out.println("PLEASE ENTER YOUR MARKS FOR TEST 1 : "); //instruction masukkan mark t1
        t1 = read.nextInt();
        System.out.println("PLEASE ENTER YOUR MARKS FOR TEST 2 : "); //instruction masukkan mark t2
        t2 = read.nextInt(); //nextInt sbb nak baca number
        
        //tunjuk input user isi tadi dengan susunan yang lebih canteks dan kira markah purata user dengan formula diberi
        System.out.println("Name        : " +name);
        System.out.println("Student ID   : " +id);
        System.out.println("Subject    : " +sub);
        int avg = (t1 + t2) / 2;
        System.out.println("AVerage Mark: " +avg);
        
        read.close();
}
}