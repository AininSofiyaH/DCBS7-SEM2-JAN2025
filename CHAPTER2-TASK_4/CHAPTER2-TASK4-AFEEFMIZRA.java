package chapter2;

import java.util.Scanner;

		public class task4 
		{
   		public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // menyuruh student meletakkan nama mereka
        System.out.print("Enter Student's Name: ");
        String name = scanner.nextLine();

        // menyuruh student meletakkan ID mereka
        System.out.print("Enter Student's ID: ");
        String id = scanner.nextLine();

        // menyuruh student meletakkan nama subject
        System.out.print("Enter Subject Name: ");
        String subject = scanner.nextLine();

        // menyuruh student meletakkan  markah test 1 mereka
        System.out.print("Test 1 Marks (out of 100): ");
        double test1 = scanner.nextDouble();

        // menyuruh student meletakkan markah test 2 mereka
        System.out.print("Test 2 Marks (out of 100): ");
        double test2 = scanner.nextDouble();

        // kiraan purata markah kedua dua test
        double average = (test1 + test2) / 2;
        
        // output keluar begini beserta input diletakkan tadi dengan lebih kemas
        System.out.println("\n--- Student's Details ---");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Subject: " + subject);
        System.out.println("Average Marks: " + average);
        System.out.println("-------------------------");

    }
}
