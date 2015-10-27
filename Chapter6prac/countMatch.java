


public class countMatch
{
    public static int countSpace(String str){
        int spaces = 0;
        for( int i = 0;
            i < str.length();
            i++ ){
                char ch = str.charAt(i);
                if (ch == ' '){
                    spaces++;
                }
        }
        return spaces;
    }
}    
    