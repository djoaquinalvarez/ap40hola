package Ejercicios;

import java.util.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.io.IOException;
import java.nio.file.*;
import java.lang.Integer;
import java.lang.Iterable;


public class Clase4E3 {


    public static void main(String[] args) throws IOException {
 
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese 'code' o 'encode': ");
    String operacion = sc.next();                                         //leer de archivo
 
    Scanner sc2 = new Scanner(System.in);
    System.out.print("Ingrese dezplazamiento: ");                    //leer de archivo
    int desplazamiento = sc2.nextInt();
 
 
    String abecedario = "abcdefghijklmnñopqrstuvwxyz";            //lo considero como dado
    

    //String codificar ="hola que tal";
    String archivo  ="C:\\Users\\franc\\eclipse-workspace\\Ejercicios\\importar3.txt" ;
    
  
  
   
    
    

    //         leer de archivo
    		                                             // quitar

    for (String codificar: Files.readAllLines(Paths.get(archivo))) {
         if (operacion.equals("code")) {
        	   		String salida=""; 
        	   		
             for (int i=0; i<codificar.length(); i++)
                 
                 
                    {    
                    
            	 
                        
                    char indice = codificar.charAt(i);
                   
                    
                    int defase = abecedario.indexOf(indice)+desplazamiento;
             
                    salida = salida + abecedario.charAt(defase);
                         
                            
                    }
                    Files.writeString(Paths.get("C:\\Users\\franc\\eclipse-workspace\\Ejercicios\\exportar3.txt" ),salida); 
                    System.out.println("proceso finalizado");
             }
    }
    for (String codificar: Files.readAllLines(Paths.get(archivo))) {
             
         if (operacion.equals("encode"))   {    
        	   		String salida=""; 
             for (int i=0; i<codificar.length(); i++)
                 
                 
                    {    
            
            	    
                        
                    char indice = codificar.charAt(i);
                   
                    
                    int defase = abecedario.indexOf(indice)+desplazamiento;
             
                    salida = salida + abecedario.charAt(defase);
                         
                            
                    }
                    Files.write(Paths.get("C:\\Users\\franc\\eclipse-workspace\\Ejercicios\\exportar3.txt" ), salida.getBytes(StandardCharsets.UTF_8) );
                    System.out.println("proceso finalizado");
                    
                    }
    }
    }
}
