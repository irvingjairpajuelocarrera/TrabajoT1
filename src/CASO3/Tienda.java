package CASO3;


import java.util.ArrayList;
import java.util.Map;

public class Tienda {
    private ArrayList<Producto> catalogo = new ArrayList<>();
    private ArrayList<Venta> ventas = new ArrayList<>();

    public void agregarProducto(Producto p) { catalogo.add(p); }

    public Producto buscarProductoPorId(String id) {
        for (Producto p : catalogo) {
            if (p.getId().equalsIgnoreCase(id)) return p;
        }
        return null;
    }

    public Venta realizarCompra(Map<String, Integer> pedido) {
        // Validar stock primero
        for (Map.Entry<String, Integer> e : pedido.entrySet()) {
            Producto p = buscarProductoPorId(e.getKey());
            if (p == null) throw new IllegalArgumentException("Producto no existe: " + e.getKey());
            int cantidad = e.getValue();
            if (p.getStock() < cantidad) throw new IllegalArgumentException("Stock insuficiente para: " + p.getNombre());
        }
        // Disminuir stock y calcular total
        double total = 0.0;
        for (Map.Entry<String, Integer> e : pedido.entrySet()) {
            Producto p = buscarProductoPorId(e.getKey());
            int cantidad = e.getValue();
            p.disminuirStock(cantidad);
            total += p.getPrecio() * cantidad;
        }
        Venta v = new Venta("V" + (ventas.size() + 1), pedido, total);
        ventas.add(v);
        return v;
    }

    public ArrayList<Producto> getCatalogo() { return catalogo; }
    public ArrayList<Venta> getVentas() { return ventas; }
}
