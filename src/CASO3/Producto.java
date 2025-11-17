package CASO3;

public class Producto {
    private String id;
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String id, String nombre, double precio, int stock) {
        if(id == null || id.trim().isEmpty()) throw new IllegalArgumentException("ID inválido.");
        if(nombre == null || nombre.trim().isEmpty()) throw new IllegalArgumentException("Nombre vacío.");
        if(precio < 0) throw new IllegalArgumentException("Precio inválido.");
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public int getStock() { return stock; }

    public void disminuirStock(int cantidad) {
        if(cantidad <= 0) throw new IllegalArgumentException("Cantidad inválida.");
        if(cantidad > stock) throw new IllegalArgumentException("Stock insuficiente para " + nombre);
        stock -= cantidad;
    }

    @Override
    public String toString() {
        return nombre + " (ID:" + id + ") - S/ " + precio + " (stock: " + stock + ")";
    }
}
