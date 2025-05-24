/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task2;
import java.util.Scanner;
/**
 *
 * @author aina
 */
public class TASK2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        //user masukkan input untuk nama,umur,gobi and fav food
        System.out.print(" Enter nama penuh awak: ");
        String name = scanner.nextLine();
        System.out.print(" Enter umur awak: ");
        int umur = scanner.nextInt();
        scanner.nextLine();
        System.out.print(" Cuba bagitahu hobi awak: ");
        String hobby = scanner.nextLine();
        System.out.print(" Awak selalu suka eat ape: ");
        String favmakanan = scanner.nextLine();

        //output diri yang akan di print
        System.out.println("\n--- Summary diri awak ! -----");
        System.out.println("--- Name: " + name);
        System.out.println("--- Umur: " + umur);
        System.out.println("--- Hobby: " + hobby);
        System.out.println("--- Makanan fav: " + favmakanan);
        System.out.println("--------------------------");
       
    }
    }
    
    

