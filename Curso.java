public class Curso {
    private String nombreCurso;
    private int nota;

    public Curso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}
