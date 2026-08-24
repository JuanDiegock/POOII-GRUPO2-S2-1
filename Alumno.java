import java.util.List;

public class Alumno extends Persona {
    public String codigoAlumno;
    public String nombreAlumno; // Asegúrate de declarar esta variable si no viene de Persona
    public List<Curso> listaCursos; // Tipo cambiado para coincidir con el constructor

    public Alumno(String codigo, String nombre, List<Curso> listaCursos) {
        // super(nombre); // Descomenta esta línea si Persona requiere el nombre en su constructor
        this.codigoAlumno = codigo;
        this.nombreAlumno = nombre;
        this.listaCursos = listaCursos;
        this.leeCursosAlumno("CursosAlumnos.txt");
    }

    public void leeCursosAlumno(String nombreArchivo) {
        // Aquí va la lógica para leer el archivo TXT
    }
}
