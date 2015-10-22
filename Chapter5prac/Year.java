
import java.util.Scanner;
/**
 * Write a description of class Year here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Year
{
   
    
    public static boolean isLeapYear(int year)
    {
        return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
    }
    public static void main(String[] args)
    {
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter a year");
       int year = scan.nextInt();
       if (Year.isLeapYear(year))
       {
           System.out.println("Leap year");
       }
       else
       {
           System.out.println("isn't a leap year");
       }
       
        
    }

}
