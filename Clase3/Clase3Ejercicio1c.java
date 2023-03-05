

public class Main {
    public static void main(String[] args) throws Exception {
        
        
        
        
        int numeros[]={57,765,4456} ;
        int x =100;
        int count =0;
        int largo =numeros.length;

     
       
                  for (int i=0; i< largo; i++ )
                  {
        
            if ( numeros[i] > x){
                
              count = count + numeros[i];
            }
        }            
 
    

        System.out.println(count);
    }
}
