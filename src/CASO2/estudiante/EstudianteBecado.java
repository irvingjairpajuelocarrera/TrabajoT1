package CASO2.estudiante;

public class EstudianteBecado extends Estudiante implements Evaluable {
    public EstudianteBecado(String nombre, String apellido, String idEstudiante) {
        super(nombre, apellido, idEstudiante);
    }

    @Override
    public double calcularMensualidad() {
        return 54.0; // ejemplo beca
    }

    @Override
    public void evaluar(double nota) {
        System.out.println(getNombreCompleto() + " evaluado en Examen final: " + nota);
    }
}