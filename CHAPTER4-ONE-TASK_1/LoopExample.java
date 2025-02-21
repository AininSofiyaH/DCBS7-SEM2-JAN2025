/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loopexample;

/**
 *
 * @author Habriyah
 */
public class LoopExample {
    public static void main(String[] args) {
        // Menggunakan for loop
        System.out.println("For Loop:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // Menggunakan while loop
        System.out.println("While Loop:");
        int j = 1;
        while (j <= 10) {
            System.out.print(j + " ");
            j++;
        }
        System.out.println("\n");

        // Menggunakan do-while loop
        System.out.println("Do-While Loop:");
        int k = 1;
        do {
            System.out.print(k + " ");
            k++;
        } while (k <= 10);
        System.out.println();
    }
}
