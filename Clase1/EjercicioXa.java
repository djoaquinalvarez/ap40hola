import java.util.*;
public class Main {
    public static void main(String[] args) {
        
        int numeroInicio = 5;
        int numeroFin = 14;
      
        
        for(int loop=numeroFin; loop>=numeroInicio; loop--)  {
                 int numeroPar = loop % 2;
                if( numeroPar == 0){
                     System.out.println( "par"+": "+loop+"," );
                                }
          
                    }
    }
}
