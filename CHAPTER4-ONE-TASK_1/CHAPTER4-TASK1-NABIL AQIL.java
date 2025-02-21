package javaapp;

/**
 *
 * @author Nabil
 */
public class Task {
    public static void main(String[] args){
        for (int i = 1 ; i <= 10 ; i++){
            System.out.print(i);
        }
        System.out.println();
        int a = 1;
        while (a <= 10){
            System.out.print(a);
            a++;
        }
        System.out.println();
        int b = 1;
        do {
            System.out.print(b);
            b++;
        } while (b <= 10);
        System.out.println();
    }
}
