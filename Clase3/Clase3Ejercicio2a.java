import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
 
 
 String abecedario = "abcdefghijklmnñopqrstuvwxyz";
 String codificar ="hola que tal";
 String salida="";
 int desplazamiento = 1;
 
 for (int i=0; i<codificar.length(); i++)
     
     
        {    

            
        char indice = codificar.charAt(i);
       
        
        int defase = abecedario.indexOf(indice)+desplazamiento;
 
        salida = salida + abecedario.charAt(defase);
             
                
        }
 
        
        System.out.println(salida);
    }
}
