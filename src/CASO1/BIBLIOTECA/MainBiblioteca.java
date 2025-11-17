package CASO1.BIBLIOTECA;

public class MainBiblioteca {
    public static void main(String[] args) {
        Autor autor1 = new Autor("Mario", "Vargas Llosa", "Perú");

        Libro libro1 = new Libro();
        libro1.registrarLibro("La ciudad y los perros", autor1, 1963, "978-...-1");
        libro1.mostrarInformacion();

        Libro libro2 = new Libro();
        libro2.registrarLibro("Pantaleón y las visitadoras", autor1, 1973);
        libro2.mostrarInformacion();

        // Ejemplo de error
        Libro libro3 = new Libro();
        try {
            libro3.registrarLibro("", autor1, 2000);
        } catch (IllegalArgumentException e) {
            System.err.println("Error esperado (título vacío): " + e.getMessage());
        }
    }
}