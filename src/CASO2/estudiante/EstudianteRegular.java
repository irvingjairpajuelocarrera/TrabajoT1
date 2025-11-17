package CASO2.estudiante;

public class EstudianteRegular extends Estudiante implements Evaluable {
    public EstudianteRegular(String nombre, String apellido, String idEstudiante) {
        super(nombre, apellido, idEstudiante);
    }

    @Override
    public double calcularMensualidad() {
        return 200.0; // ejemplo
    }

    @Override
    public void evaluar(double nota) {
        System.out.println(getNombreCompleto() + " evaluado en Examen final: " + nota);
    }
}