import java.util.ArrayList;
import java.util.List;

public class Alumno extends Persona {

    private String codigoAlumno;
    private List<Curso> listaCursos;

    public Alumno(String dni, String nombre, String apellido,
                  String codigoAlumno) {

        super(dni, nombre, apellido);

        this.codigoAlumno = codigoAlumno;
        this.listaCursos = new ArrayList<>();
    }

    public String getCodigoAlumno() {
        return codigoAlumno;
    }

    public List<Curso> getListaCursos() {
        return listaCursos;
    }

    public void agregarCurso(Curso curso) {
        listaCursos.add(curso);
    }

    public void mostrarCursos() {

        System.out.println("Cursos del alumno "
                + getNombre() + " " + getApellido());

        for (Curso curso : listaCursos) {
            System.out.println("- " + curso.getNombreCurso()
                    + " | Nota: " + curso.getNota());
        }
    }
}
