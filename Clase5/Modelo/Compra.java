package Modelo;

import java.time.LocalDateTime;



public class Compra {

	/*
	Joaquín Alvarez: Podrías agregar el método addItem() para agregar cada uno de los items a la compra, una vez que ya los tengas instanciados. 
	*/
	


	private LocalDateTime fechaCompra;
	private ItemCompra[] items;
	
	
	public LocalDateTime getFechaCompra() {
		return fechaCompra;
	}
	
	
		
	public Compra() {                 //constructor
	this.fechaCompra = LocalDateTime.now();
	this.items = new ItemCompra[10];  //pruebo con 10
	
		}
	
	
	public Compra(LocalDateTime fechaCompra, ItemCompra[] items) {
		
	this.fechaCompra = fechaCompra;
	this.items = items;
		
		
	}
	
	
	
	
	public void setFechaCompra(LocalDateTime fechaCompra) {
		this.fechaCompra = fechaCompra;
	}
	
	public ItemCompra[] getItems() {
		return items;
	}
	
	public void setItems(ItemCompra[] items) {
		this.items = items;
	}
	



	
		public double calcularTotal() {
		double total=0;
		
		
			for (int i=0; i<3;i++) {
	ItemCompra item = items[i];
	total += item.calcularSubtotal();}
			return total;
	 
		
	}
		


}
	
	

	
	

	
