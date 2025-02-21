package javaapp;

/**
 *
 * @author Nabil
 */
public class Task {
    public static void main(String[] args){
        int sum_i = 0;
        for (int i = 1 ; i <= 10 ; i++){
            if (i % 2 == 0){
                continue;
            }
            sum_i += i;
        }
        System.out.println("The sum of odd number is " + sum_i);
        int sum_a = 0;
        for (int a = 1 ; a <= 10 ; a++){
            if (a % 2 != 0){
                continue;
            }
            sum_a += a;
        }
        System.out.println("The sum of even number is " + sum_a);
    }
}
