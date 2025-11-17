package CASO2.estudiante;


public class Estudiante {
    private String nombre;
    private String apellido;
    private String idEstudiante;

    public Estudiante(String nombre, String apellido, String idEstudiante) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.idEstudiante = idEstudiante;
    }

    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }

    public double calcularMensualidad() {
        return 0;
    }
}