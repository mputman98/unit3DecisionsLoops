import java.util.Scanner;

public class subStrings
{
    public static void main(String[] args){
        String word = "rum";
        int  count = 0;
        while (count < (word.length() +1)){
            System.out.println(word.substring(0,count));
            count++;
        }
  }
}
       
   
   