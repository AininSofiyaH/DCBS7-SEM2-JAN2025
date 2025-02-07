package chapter2;

import java.util.Scanner;

public class ArithmeticProg {
public static void main(String[] args) {
	
	int num1, num2;
	
        Scanner scanner = new Scanner(System.in);
        
     // saya menyuruh user meletakkan nombor pertama
        System.out.print("Please masukkan number first anda: ");
        num1 = scanner.nextInt();
        
     // saya menyuruh user meletakkan nombor kedua
        System.out.print("Okay pastu letak la lagi satu nombor: ");
        num2 = scanner.nextInt();

        // ini bahagian kalkulasi
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
      
    }
}
