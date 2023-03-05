import java.util.*;

public class Main {
    public static void main(String[] args)  {
        
        
        char letra = 'a' ;
        String str = "argentina";
        int count = 0;

        
        for (int i = 0; i< str.length(); i++ )  {
        
            if (str.charAt(i) == letra) {
                count++;
            }
        }
        
        
        System.out.println(count);
    }
}
