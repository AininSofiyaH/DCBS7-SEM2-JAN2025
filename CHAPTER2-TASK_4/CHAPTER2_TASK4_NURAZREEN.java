import java.util.Scanner;

public class CHAPTER2_TASK4_NURAZREEN
{
    public static void main(String[]args) {

        // Declare jenis data yang sesuai untuk variable
       String Name , Id , Subject; 
       int Test1 , Test2; 
       
        Scanner baca = new Scanner(System.in);

        System.out.println("Enter Your Name : "); //prompt untuk enter nama
        Name = baca.nextLine(); 

        System.out.println("Enter your Id : ");  // prompt untuk enter id
        Id = baca.nextLine();  

        System.out.println("Enter your Subject : ");  //prompt untu enter subject
        Subject = baca.nextLine();  
 
        //prompt untuk masukkan marks on both test
        System.out.println("Enter your marks on Test1 (/100): ");
        Test1 = baca.nextInt();

        System.out.println("Enter your marks on Test2 (/100) : "); 
        Test2 = baca.nextInt();     

        int Mark = (Test1 + Test2 )/2;
        System.out.println("Average Mark: " + ((Test1 + Test2) /2) + "/100"); // output untuk average marks
        baca.close();
    }
}