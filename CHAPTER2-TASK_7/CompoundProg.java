/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package compoundprog;

/**
 *
 * @author Habriyah
 */


   public class CompoundProg {
    public static void main(String[] args) {
        // TASK VARIABLE 
        System.out.println("VARIABLES - PRE INCREMENT ++a");
        System.out.println("Increment dahulu, kemudian gunakan nilai");
        int a = 6;
        int b = ++a; // Increment dahulu, kemudian gunakan nilai
        System.out.println("PRE-INCREMENT:");
        System.out.println("Value of a: " + a); // 7
        System.out.println("Value of b: " + b); // 7
        
        System.out.println("\nVARIABLES - POST INCREMENT a++");
        System.out.println("Gunakan nilai dahulu, kemudian increment");
        int c = 5;
        int d = c++; // Gunakan nilai dahulu, kemudian increment
        System.out.println("POST-INCREMENT:");
        System.out.println("Value of c: " + c); // 6
        System.out.println("Value of d: " + d); // 5

        System.out.println("\nVARIABLES - POST DECREMENT a--");
        System.out.println("Gunakan nilai dahulu, kemudian decrement");
        int e = 6;
        int f = e--; // Gunakan nilai dahulu, kemudian decrement
        System.out.println("POST-DECREMENT:");
        System.out.println("Value of e: " + e); // 5
        System.out.println("Value of f: " + f); // 6

        System.out.println("\nVARIABLES - PRE DECREMENT --a");
        System.out.println("Decrement dahulu, kemudian gunakan nilai");
        int g = 6;
        int h = --g; // Decrement dahulu, kemudian gunakan nilai
        System.out.println("PRE-DECREMENT:");
        System.out.println("Value of g: " + g); // 5
        System.out.println("Value of h: " + h); // 5
    }
}