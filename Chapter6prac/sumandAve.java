import java.util.Scanner;


public class sumandAve
{
  public static double averageInputs()
    {
       
       Scanner scan = new Scanner(System.in);
       double total = 0; 
       int count = 0;
       System.out.println("enter a series of doubles or any character to quit");
       
       while(scan.hasNextDouble())
       {
          double num = scan.nextDouble();
          total += num;
          count ++;
          
       }
       double ave = 0;
       
       if (count > 0)
       {
           ave = total/ count;
       }
       
       return ave;
    }
}
    