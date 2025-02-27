/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tasklooping2;

/**
 *
 * @author aina
 */
public class Tasklooping2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          //for loop
        
        System.out.println("Printing Numbers from 1 to 10");{
        int count = 1;
        for(count = 1; count <= 10; count++){     //baca dari satu and until no less than 10, count++ tu tambah no
            int sum = count + count;              //formula sum
            System.out.println(sum);
             
        }}
    
        
        //while loop
        
     
        System.out.println("Printing Numbers from 1 to 10");{
        int count = 1;                         //first cond
        while(count <= 10){                    //2nd cond
            int sum = count + count;           //formula sum
            System.out.println(sum);           //print out sum if first and sec cond true
            count++;                           //ulangkan for next no and tambah
        }}
      
   
 
        //do while loop
        

        System.out.println("Printing Numbers from 1 to 10");
        int count = 1;{
        do{                                      
            int sum = count + count;             //cari sum
            System.out.println(sum);             //print sum
            count++;}                            //count akan bertambah 1 for next no
        while(count <= 10);                     

    }
        
    }
}