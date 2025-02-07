import java.util.Scanner;

public class ArithmeticProg

 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.print("Enter the first integer: ");
        int num1 = read.nextInt();
        
        System.out.print("Enter the second integer: ");
        int num2 = read.nextInt();
        
        int sum = num1 + num2;
        System.out.println("Addition (num1 + num2): " + sum);
        
        int difference = num1 - num2;
        System.out.println("Subtraction (num1 - num2): " + difference);
        
        int product = num1 * num2;
        System.out.println("Multiplication (num1 * num2): " + product);
        
        int qoutient = num1 / num2;
        System.out.println("Division (num1 / num2): " + product);
    }
}