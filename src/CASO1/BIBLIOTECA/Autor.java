package CASO1.BIBLIOTECA;

public class Autor {
    private String nombre;
    private String apellido;
    private String nacionalidad;

    public Autor(String nombre, String apellido, String nacionalidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getNacionalidad() { return nacionalidad; }

    @Override
    public String toString() {
        return nombre + " " + apellido + " (" + nacionalidad + ")";
    }
}