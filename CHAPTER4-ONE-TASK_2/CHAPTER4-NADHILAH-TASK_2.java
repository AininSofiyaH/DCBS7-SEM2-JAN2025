/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumexample;

/**
 *
 * @author Habriyah
 */
public class SumExample {
    public static void main(String[] args) {
        int sum = 0; // variable untuk menyimpan data

        // Menggunakan for loop
        for (int i = 1; i <= 10; i++) {
            sum += i; //tambah nilai i ke dalam sum
        }
        System.out.println("\nFor Loop Sum: " + sum);

        // Menggunakan while loop
        sum = 0;
        int j = 1;
        while (j <= 10) {
            sum += j; // tambah nilai j ke dalam sum
            j++; //tambah nilai 1 ke j
        }
        System.out.println("\nWhile Loop Sum: " + sum);

        // Menggunakan do-while loop
        sum = 0;
        int k = 1;
        do {
            sum += k; // tambah nilai k ke dlm sum
            k++; // tambah 1 ke 
        } while (k <= 10);
        System.out.println("\nDo-While Loop Sum: " + sum);
    }
}
