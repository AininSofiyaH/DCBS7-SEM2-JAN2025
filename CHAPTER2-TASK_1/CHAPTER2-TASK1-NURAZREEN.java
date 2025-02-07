import java.util.Scanner;

public class ArithmeticProg
{

        /**
         * @param args
         */
        public static void main(String[]args) {
            int num1, num2, jawapan;
            int plus, minus,multiply,divide,modulus;

            Scanner baca = new Scanner(System.in);

            System.out.println("Masukkan nombor pertama : ");
            num1 = baca.nextInt();  //terima n simpan input user

            System.out.println("Masukkan nombor kedua : ");
            num2 = baca.nextInt();  //terima n simpan input user 

            plus = num1+num2;
            minus = num1*num2;

            System.out.println("Tambah : " + num1 +" + "+num2 +" = "+ (plus));
            System.out.println("Darab : " + num1 +" * "+num2 +" = "+ (minus));
            System.out.println("Bahagi : " + num1 +" / "+num2 +" = "+ (num1/num2));
            System.out.println("Tolak  : " + num1 +" / "+num2 +" = "+ (num1-num2));
            System.out.println("Modulus : " + num1 +" % "+num2 +" = "+ (num1%num2));

            baca.close();
        }
    }
