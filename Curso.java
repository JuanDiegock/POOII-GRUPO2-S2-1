public class Curso {

    private String nombreCurso;
    private int nota;

    public Curso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
        this.nota = 0;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Curso: " + nombreCurso +
               " | Nota: " + nota;
    }
}
