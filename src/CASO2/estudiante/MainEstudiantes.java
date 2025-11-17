package CASO2.estudiante;

public class MainEstudiantes {
    public static void main(String[] args) {
        EstudianteRegular e1 = new EstudianteRegular("Juan", "Perez", "R001");
        EstudianteBecado e2 = new EstudianteBecado("María", "Gómez", "B001");

        System.out.println(e1.getNombreCompleto() + " - Mensualidad: S/ " + e1.calcularMensualidad());
        System.out.println(e2.getNombreCompleto() + " - Mensualidad: S/ " + e2.calcularMensualidad());

        // Referencia como Estudiante
        Estudiante e = e2;
        System.out.println("Referencia Estudiante -> Mensualidad: S/ " + e.calcularMensualidad());

        e1.evaluar(18.5);
        e2.evaluar(18.5);
    }
}