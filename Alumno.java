import java.util.List;

public class Alumno extends Persona {
    private String codigoAlumno;
    private List<Curso> listaCursos;

    public Alumno(String dni, String nombre, String apellido,
                   String codigoAlumno, List<Curso> listaCursos) {
        super(dni, nombre, apellido);
        this.codigoAlumno = codigoAlumno;
        this.listaCursos = listaCursos;
    }

    public void mostrarCursos() {
        System.out.println("Cursos matriculados:");

        for (Curso curso : listaCursos) {
            System.out.println("- " + curso.getNombreCurso());
        }
    }
}
