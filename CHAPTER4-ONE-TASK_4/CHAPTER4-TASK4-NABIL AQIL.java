package javaapp;

/**
 *
 * @author Nabil
 */
public class Task {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("Power of 1 - 10:");
        
        for (int n = 1; n <= 10; n++) {
            int power = (int) Math.pow(n, 2);
            System.out.println(n + " * " + n + " = " + power);
            sum += power;
        }

        System.out.println("\nSum of n ^ 2 from 1 to 10: " + sum);
    }
}