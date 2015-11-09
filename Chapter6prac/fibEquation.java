
import java.util.Scanner;

public class fibEquation
{
   public static void main(String[] args){
       System.out.println("Enter the integer you want evaluated into a Fibonacci number"); 
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       int f1 = 1;
       int f2 = 1;
       int fn = f1 + f2;
       if (n = 1 || 2 ){
           System.out.println("the" +" "+ n + "st/nd fibonacci number is 1");
       }
       else{
           for (int count = 0; count < n-3; count++){
               f2 = f1;
               f1 = fn;
               fn =f1 + f2;
        }
        System.out.println("The"+" "+ n +"th fibonacci number is" +" "+ fn); 
       }
  }
}