import java.util.Scanner;

public class ArithmeticProg {
    public static void main(String[] args) {
        int num1, num2;
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter your first number : ");
        num1 = in.nextInt();
        
        System.out.print("Enter your second number : ");
        num2 = in.nextInt();
        
        System.out.println("\nThis is the answer for all arithmetic equation :-");
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
    }
}
