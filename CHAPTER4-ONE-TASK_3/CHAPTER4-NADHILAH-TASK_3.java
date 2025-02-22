/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evenoddsum;

/**
 *
 * @author Habriyah
 */
public class EvenOddSum {
    public static void main(String[] args) {
        int evenSum = 0, oddSum = 0;

        System.out.println("Even numbers:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                evenSum += i;
            }
        }
        System.out.println("\nSum of even numbers: " + evenSum);

        System.out.println("\nOdd numbers:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                oddSum += i;
            }
        }
        System.out.println("\nSum of odd numbers: " + oddSum);
    }
}

