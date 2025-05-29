/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chapter5_references;

/**
 *
 * @author Habriyah
 */
public class Chapter5_references {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        System.out.println("Numbers 1 - 10");
        int i; //letak kat luar so that boleh baca declaration sampai for the whole coding
        for (i = 1; i <= 10;i++){
            if (i == 5)
                break; //terminate
            System.out.println(i + "\t");} //letak curly bracket untuk stopkan
        System.out.println("Broke out of loop at i = "+i);
        
        //TASK 2
        
         System.out.println("Numbers 1 - 10");
        for (i = 1; i <= 10;i++){
            if (i == 5)
                continue; //skip condition if then continue
            System.out.println(i + "\t");} //letak curly bracket untuk stopkan
        System.out.println("Skip printing 5");
        
        //TASK 3 & 4
        formula1 objectformula1 = new formula1();
        Display Display = new Display();
        
        int result, result2;  // kena declare if number
        String result4,result5,result7;        // kena declace if word or letter
        for (i = 1; i <=5; i++) {
            result = formula1.square(i); //the parameter
            result2 = formula1.cube(i); //i alr declared since first
            objectformula1.result3 = formula1.add(i);
            objectformula1.result6 = formula1.sub(i);
            result4 = Display.mesej();
            result5 = Display.chattomiss();
            result7 = Display.lastmesejtomiss();
            
            
            System.out.println("\nThe square of " + i +" is = " +result );
            System.out.println("\nThe cube of " + i +" is = " +result2 );
            System.out.println("\nThe addition of " + i +" is =" +objectformula1.result3);
            System.out.println("\nThe sub of " + i +" is =" +objectformula1.result6);
            System.out.println("\n"+result4);
            System.out.println("\n"+result5);
            System.out.println("\n"+result7);
        }
    }
         
         
}
