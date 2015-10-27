
import java.util.Scanner;

public class promptUntilMatch
{
  public static double promptUntilMatch(){
   Scanner scan = new Scanner(System.in);
   boolean valid = false;
   double input = 0;
   do{
       System.out.println("enter a positive number < 100:");
       input = scan.nextDouble();
       if( input > 0 && input <100){
           valid = true;
       }
       
   }
   while (!valid);
   return input;
  }
}  
