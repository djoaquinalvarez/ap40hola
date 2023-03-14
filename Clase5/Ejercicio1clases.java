public class CarritoCompras {
    private String cliente;
    private LocalDate fechaCompra;
    private double precio;
    private String item1;
    private String item2;
    private String item3;
    
    public CarritoCompras(String cliente, LocalDate fechaCompra, double precio, String item1, String item2, String item3) {
        this.cliente = cliente;
        this.fechaCompra = fechaCompra;
        this.precio = precio;
        this.item1 = item1;
        this.item2 = item2;
        this.item3 = item3;
    }
}

public class Producto {
    private String nombreProd;
    private double precio;
    private int cantidad;
    
    public Producto(String nombreProd, double precio, int cantidad) {
        this.nombreProd = nombreProd;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    
    public static class Descuento {
        private boolean aplica;
        
        public Descuento(boolean aplica) {
            this.aplica = aplica;
        }
    }
}
