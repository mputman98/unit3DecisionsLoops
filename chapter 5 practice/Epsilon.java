import java.util.Scanner;

/**
 * Write a description of class Epsilon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Epsilon
{
   public final static double EPSILON = 1e-12;
    public static void main( String[] args)
   {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter a floating point number:");
       double i = in.nextDouble();
       
       String adj = "";
       if( Math.abs(i) < 1.0)
       {
           adj = "small";
       }   
    
       else if(Math.abs(i) > 1000000)
       {
           adj = "large";
       }    
       
       if( Math.abs(i) < EPSILON ) 
       {    
           System.out.println( "Its a zero");
       }
       else if(i > 0)
       {
           System.out.println("Its a" + adj + " positive number.");
       }
       else
       {
           System.out.println( " its a" + adj + "negative number");
       }    
       System.out.println(adj);
    }
}