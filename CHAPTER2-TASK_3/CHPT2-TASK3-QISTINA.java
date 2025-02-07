/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taskfortoday3;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author qistina
 */
public class TaskForToday3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int year, month, day;
        Scanner read = new Scanner(System.in);
        
        System.out.println("Enter your date of birth:");
        
        System.out.print("Year (YYYY): ");
        year = read.nextInt();

        System.out.print("Month (1-12): ");
        month = read.nextInt();

        System.out.print("Day (1-31): ");
        day = read.nextInt();
        
        LocalDate currentDate = LocalDate.now();
        LocalDate birthDate = LocalDate.of(year, month, day);
        Period age = Period.between(birthDate, currentDate);

        System.out.println("Your age is: " + age.getYears() + " years, " + age.getMonths() + " months, and " + age.getDays() + " days.");

        read.close();
        
    }
    
}
