import java.util.Scanner; 

public class CHAPTER2_TASK6_NURAZREEN {

    public static void main (String[] args) {
         
        //declare type of data for variable
        String gender ;
        Float weight, height; 

        Scanner baca = new Scanner (System.in) ;

        System.out.println("Your BMI Calculator ! \n");

        System.out.println("Enter Your gender :");
        gender = baca.nextLine(); 

        System.out.println("Enter Your Weight");
        weight = baca.nextFloat();

        System.out.println("Enter your Height");
        height = baca.nextFloat();

        float BMI = weight / (height * height);
        System.out.println("BMI = " + (weight / (height * height ))); // calculation for bmi
       
        // untuk user refer their bmi
        System.out.println(" \n******** REFER YOUR BMI HERE !! ********\n");

        System.out.println("if your bmi < 18.5");
        System.out.println("Result : UNDER WEIGHT\n");

        System.out.println("if your bmi 18.5 - 24.9 ");
        System.out.println("Result : NORMAL\n");

        System.out.println("if your bmi 25.0 - 29.9");
        System.out.println("Result : OVER WEIGHT\n");


        System.out.println("if your bmi 30.0 - 34.9");
        System.out.println("Result : OBESE\n");




    
    
    
    
    
    }


}
