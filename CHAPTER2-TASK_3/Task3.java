/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task.pkg3;
import java.util.Scanner;
/**
 *
 * @author sufi
 */
public class Task3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Tahun Lahir: ");
        int birthYear = scanner.nextInt();
        int currentYear = 2025;
        int age = currentYear - birthYear;
        
        System.out.println("Anda berumur "  +(age) + " tahun.");
        scanner.close();
    }
    
}
