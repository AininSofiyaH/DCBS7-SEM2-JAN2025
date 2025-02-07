package chapter2;

import java.util.Scanner;

		public class task2
		{
		public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Enter your full name pls : ");
        String name = scanner.nextLine();
        System.out.print("Enter your REAL age: ");
        int umur = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Apa hobi awak eh?: ");
        String hobby = scanner.nextLine();
        System.out.print("Awak suka makan apa hehe: ");
        String favmakanan = scanner.nextLine();
    
        System.out.println("\n--- Informasi Anda ! -----");
        System.out.println("--- Name awak: " + name);
        System.out.println("--- Umur awak: " + umur);
        System.out.println("--- Hobby awak: " + hobby);
        System.out.println("--- Makanan fav awak: " + favmakanan);
        System.out.println("--------------------------");
       
    }
}

