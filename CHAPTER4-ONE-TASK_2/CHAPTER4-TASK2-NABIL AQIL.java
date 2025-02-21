package javaapp;

/**
 *
 * @author Nabil
 */
public class Task {
    public static void main(String[] args){
        int sum_i = 0 , sum_a = 0 , sum_b = 0;
        for (int i = 1 ; i <= 10 ; i++){
            sum_i += i;
            System.out.println("The sum is " + sum_i);
        }
        System.out.println();
        int a = 1;
        while (a <= 10){
            sum_a += a;
            System.out.println("The sum is " + sum_a);
            a++;
        }
        System.out.println();
        int b = 1;
        do {
            sum_b += b;
            System.out.println("The sum is " + sum_b);
            b++;
        } while (b <= 10);
        System.out.println();
    }
}
