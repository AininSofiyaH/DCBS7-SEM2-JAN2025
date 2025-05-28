


import java.util.Scanner;

public class task1 {public static void main(String[]args) {
	Scanner amir = new Scanner(System.in);

    System.out.print("Enter Student's Name: ");
    String name = amir.nextLine();

    System.out.print("Enter Student's ID: ");
    String id = amir.nextLine();

    System.out.print("Enter Subject Name: ");
    String subject = amir.nextLine();

    System.out.print("Test 1 Marks (out of 100): ");
    double test1 = amir.nextDouble();

    System.out.print("Test 2 Marks (out of 100): ");
    double test2 = amir.nextDouble();

    double average = (test1 + test2) / 2;
    System.out.println("\n--- Student's Details ---");
    System.out.println("Name: " + name);
    System.out.println("ID: " + id);
    System.out.println("Subject: " + subject);
    System.out.println("Average Marks: " + average);

    if (average >= 90) {
    	System.out.println("Grade=A");}
        
        else if (average >=80) {
    	System.out.println("Grade=A-");}
        
        else if (average >=75) {
        System.out.println("Grade=B+");}
        
        else if (average >=70) {
        System.out.println("Grade=B");}
        
        else if (average >=60) {
        System.out.println("Grade=C");}
        
        else {
        System.out.println("Grade=F");}
}
}

