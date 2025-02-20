package Chapter3;

import java.util.Scanner;

		public class task1 {
		public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String grade;
        
        // saya menyuruh student meletakkan markah mereka
        System.out.print("Enter your final mark: ");
        int mark = scanner.nextInt();
       
        // pembahagian gred mengikut markah student letak
        if (mark >= 90) 
        { System.out.println("Tahniah, anda hebat sangat! Anda dapat A+ !");
        } else if (mark >= 80) 
        { System.out.println("Tahniah anda dapat A !, kekalkan momentum");
        } else if (mark >= 70) 
        { System.out.println("Grade anda ialah B, tingkatkan usaha sedikit");
        } else if (mark >= 60) 
        { System.out.println("Hmmm, awak dapat C, macam mana ni");
        } else if (mark >= 50) 
        { System.out.println("Aduh, macam mana boleh dapat D ni");
        } else 
        {   grade = "F";
          System.out.println("AWAK DAPAT F?? JUMPA SAYA SEKARANGG!!");
        }
        
        
    }
}
