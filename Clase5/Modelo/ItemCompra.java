package Modelo;


public class ItemCompra {
	
	
	private Producto producto;
	private int cantidad;
	
	
	
	
	
	public ItemCompra(Modelo.Producto producto, int cantidad) {
	
		this.producto = producto;
		this.cantidad = cantidad;
	}

	public ItemCompra() {
		super();
	}

	
	
	
	
	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public double calcularSubtotal() {
		double subtotal = 0;//
		subtotal = cantidad * producto.getPrecio();
		return subtotal;
		
	}
	
}
	