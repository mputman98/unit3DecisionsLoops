

/**
 * Write a description of class Stringcompare here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StringCompare
{
   static String word1 = "catalog";
   static String word2= "cat";
    public static void main(String[] ars)
   {
       if (word1.compareTo("aaa")> 0)
       {
           System.out.println("word1 is greater than \"aaa\"");
           
       }
       if (word2.equals(word1))
       {
            System.out.println("word2 is equal to word2");
            
       }
       if (word1.compareTo(word2)<0)
       {
            System.out.println("word1 is less than word2");
       }
       if (word1.substring(0,3).equals(word2.substring(0,3)))
       {
           System.out.println("word1 contains the same 3 letter prefix as word2");
       }
   }    
}           