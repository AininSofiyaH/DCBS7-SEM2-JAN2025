import java.util.Scanner;

public class CHAPTER3_TASK1_NURAZREEN {
public static void main(String[]args){

    int Grade;
    Scanner baca = new Scanner(System.in);

    System.out.println("Enter Your Mark");
    Grade = baca.nextInt();

    if (Grade >= 70)
    System.out.println("Congrats , pandai");
     
    else if (Grade >= 50)
    System.out.println("Congrats jugak, tapi kena usaha lagi");

    else 

        System.out.println("Failed !!!! BELAJAR LAGI !!");

    }
}
        