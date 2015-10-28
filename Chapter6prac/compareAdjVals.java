import java.util.Scanner;


public class compareAdjVals
{
    public static final double Epsilon = 1e-12;
    public static void checkDuplacates(){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a character or series of numbers for the program to quit");
        double input = scan.nextDouble();
        while ( scan.hasNextDouble()){
            double previousInput = input;
            input = scan.nextDouble();
            if(Math.abs(input - previousInput) < Epsilon){//equality operater works here too
                System.out.println("dupilacate input");
            }
        }
    }
}