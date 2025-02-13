/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arithmeticoperator;
import java.util.Scanner;
/**
 *
 * @author sammy
 */
public class ArithmeticOperator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double n1,n2;
       int op;
       double sum;
               
        Scanner read = new Scanner(System.in);
        
        System.out.println("Please enter the first number : "); 
        n1 = read.nextDouble();
        System.out.println("Please enter the second number : ");
        n2 = read.nextDouble();
        
        System.out.println("Please choose an arithmetic operation : ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        op = read.nextInt();  
        
        switch (op) {
            case 1:
                sum = n1 + n2;
                System.out.println(+ n1 + " + " + n2 + " = " + sum);
                break;
                case 2:
                sum = n1 - n2;
                System.out.println(+ n1 + " - " + n2 + " = " + sum);
                break;
                case 3:
                sum = n1 * n2;
                System.out.println(+ n1 + " X " + n2 + " = " + sum);
                break;
                case 4:
                sum = n1 / n2;
                System.out.println(+ n1 + " / " + n2 + " = " + sum);
                break;
                case 5:
                sum = n1 % n2;
                System.out.println(+ n1 + " % " + n2 + " = " + sum);
                break;
       }
        read.close();
    }
}
