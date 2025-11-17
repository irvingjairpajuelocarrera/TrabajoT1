package CASO3;

import java.util.HashMap;
import java.util.Map;

public class MainTienda {
    public static void main(String[] args) {
        Producto p1 = new Producto("P001", "Crampones", 250.0, 5);
        Producto p2 = new Producto("P002", "Piolet", 180.0, 3);

        Tienda tienda = new Tienda();
        tienda.agregarProducto(p1);
        tienda.agregarProducto(p2);

        Map<String, Integer> pedido = new HashMap<>();
        pedido.put("P001", 2);
        pedido.put("P002", 1);

        try {
            Venta v = tienda.realizarCompra(pedido);
            System.out.println("Venta realizada. ID: " + v.getId() + " - Total: S/ " + v.getTotal());
        } catch (IllegalArgumentException ex) {
            System.err.println("Error en la compra: " + ex.getMessage());
        }
    }
}
