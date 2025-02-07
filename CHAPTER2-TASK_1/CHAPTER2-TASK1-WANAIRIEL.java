import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Task 1: Arithmetic Operations");
        System.out.print("Enter first number: ");
        int num1 = read.nextInt();
        System.out.print("Enter second number: ");
        int num2 = read.nextInt();

        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));

        
    }
}