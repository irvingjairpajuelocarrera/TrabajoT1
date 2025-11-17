package CASO3;

import java.time.LocalDateTime;
import java.util.Map;

public class Venta {
    private String id;
    private Map<String, Integer> items;
    private double total;
    private LocalDateTime fecha;

    public Venta(String id, Map<String, Integer> items, double total) {
        this.id = id;
        this.items = items;
        this.total = total;
        this.fecha = LocalDateTime.now();
    }

    public double getTotal() { return total; }
    public String getId() { return id; }
    public LocalDateTime getFecha() { return fecha; }
}
