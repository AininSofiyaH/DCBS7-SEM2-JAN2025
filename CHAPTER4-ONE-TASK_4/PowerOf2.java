/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package powerof2;

/**
 *
 * @author Habriyah
 */
public class PowerOf2 {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("Power of 2 (n):");
        
        for (int n = 1; n <= 10; n++) {
            int power = (int) Math.pow(n, 2);
            System.out.println(n + "^2" + " = " + power);
            sum += power;
        }

        System.out.println("Sum of n^2 from 1 to 10: " + sum);
    }
}
