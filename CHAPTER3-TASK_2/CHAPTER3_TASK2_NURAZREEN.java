import java.util.Scanner;

public class CHAPTER3_TASK2_NURAZREEN {

    public static void main(String[]args) {
        
        
        int num1, num2, jalan_kira; 
        Scanner baca = new Scanner(System.in);

        System.out.println("Pilih operasi anda : \n1.tambah \n2.darab \n3.tolak \n4.bahagi");
    
        System.out.println("pilih operasi anda (masukkan nombor sahaja) : ");

        jalan_kira = baca.nextInt(); 
        
        System.out.println("Masukkan nombor pertama anda : "  );
        num1 = baca.nextInt();

        System.out.println("Masukkan nombor kedua anda : "  );
        num2 = baca.nextInt();

        switch(jalan_kira){

            case 1 :System.out.println("Tambah : " + num1 +" + "+num2 +" = "+ (num1+num2));
            case 2 :System.out.println("Darab : " + num1 +" * "+num2 +" = "+ (num1*num2));
            case 3 :System.out.println("Tolak  : " + num1 +" / "+num2 +" = "+ (num1-num2));
            case 4 :System.out.println("Bahagi : " + num1 +" / "+num2 +" = "+ (num1/num2));


        }

    }
}
               
   