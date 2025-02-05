package Chapter2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
    
    	// aim of my code is to make a different approach on this task for fun
    	// and to play around the way to use the value stored on the variable
    	
    	String nama , hobi , makan ,umur; //create variable untuk 4 string value
    	
    	System.out.println("Seseorang : Kamu! Hensemnya kamu, apa nama kamu?");
    	System.out.print("Kamu : Nama saya "); 
    	Scanner hola = new Scanner(System.in); //get the input of the user's name and make it interactive like
    	
    	nama = hola.nextLine();
    	
    	System.out.println("Seseorang : Ouhh nama kamu " + nama + " ye. Apa hobby kamu " + nama + " ?");
    	System.out.print(nama + " : Hobby saya ialah ");
    	hobi = hola.nextLine(); // next lets get the value of the hobby which will be stored in the hobi variable
    	
    	System.out.println("Seseorang : Ouhh awak suka " + hobi);
    	System.out.print("Seseorang : Berapa umur kamu "+nama+ " ?\n"+nama+" : Umur saya sebenarnye ");
    	umur = hola.nextLine(); // here we will get the age of the user which will be stored in  the variable i named umur
    	
    	System.out.println("Seseorang : Lahh kita sama umur lah ni "+ umur + " tahun!");
    	System.out.println(nama + " : Nampak gaya macam tu la");
    	System.out.print("Seseorang : Ok la last makanan favourite kau apa ?\n" + nama + " : Makanan Favourite saya ialah ");
    	makan = hola.nextLine(); // next on the task is to get the user's favourite food
    	
    	System.out.println("Seseorang : WoW sama jugak lah, saya pun suka " + makan +" sebenarnye");
    	System.out.println(nama + " : WOW SUPERR!!");
    	
    	// yeeyyy dah habis
    }

}
