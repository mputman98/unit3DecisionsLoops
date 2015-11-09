
import java.util.Scanner;


public class Diamond
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the side length");
        int sidelength = in.nextInt();
        for ( int row = 0; row < sidelength; row ++){
            for( int spaces = 0; spaces < sidelength - row - 1; spaces++){
                System.out.println(" ");
            }
            for ( int stars = 0; stars < row *2 + 1; stars++){
                System.out.println("*");
            }
            System.out.print("\n");
        }
        for (int row= sidelength - 2; row >=0; row--){
            for( int spaces = 0; spaces < sidelength - row - 1; spaces++){
                System.out.println(" ");
            }
            for ( int stars = 0; stars < row *2 + 1; stars++){
                System.out.println("*");
            }
        }
    }
}
            