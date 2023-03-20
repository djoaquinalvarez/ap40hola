import java.nio.file.Paths;
import java.util.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.nio.charset.Charset;
import java.io.IOException;
import java.nio.file.*;
import java.lang.Integer;
import java.lang.Iterable;
import Modelo.Compra;
import Modelo.ItemCompra;
import Modelo.Producto;



public class CarritoApp {

	public static void main(String[] args) {
		

	
		Compra compra = new Compra();
		

		try {
		int i =0;
		for(String linea : Files.readAllLines(Paths.get("C:\\Users\\franc\\eclipse-workspace\\CarritoApp\\src\\archivo.txt")))
		{
			
			//System.out.println(linea);
			
			String nombre = linea.split( ";" )[0]; 
			int cantidad = Integer.parseInt(linea.split(";" )[1]);
			double precio = Double.parseDouble(linea.split(";" )[2]);
			
			Producto producto = new Producto (nombre, precio);
			ItemCompra itemCompra = new ItemCompra( producto, cantidad); 
		
			compra.getItems()[i] = itemCompra;
			i++;
			
			
		}
		System.out.println(compra.calcularTotal());
		
		} catch (IOException e) {   
		    throw new RuntimeException(e);
		}
		
	}




		}
