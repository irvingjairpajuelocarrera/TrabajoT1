package CASO1.BIBLIOTECA;

public class Libro {
    private String titulo;
    private Autor autor;
    private int anio;
    private String ISBN;

    // Registrar libro sin ISBN
    public void registrarLibro(String titulo, Autor autor, int anio) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("El título del libro no puede estar vacío.");
        }
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.ISBN = "N/D";
    }

    // Registrar libro con ISBN (sobrecarga)
    public void registrarLibro(String titulo, Autor autor, int anio, String ISBN) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("El título del libro no puede estar vacío.");
        }
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.ISBN = ISBN;
    }

    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año: " + anio);
        System.out.println("ISBN: " + ISBN);
        System.out.println();
    }
}