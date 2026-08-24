import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Curso> cursos = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("cursos.txt"));

            String linea;

            while ((linea = br.readLine()) != null) {
                cursos.add(new Curso(linea));
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error al leer el archivo.");
        }

        Alumno alumno = new Alumno(
                "12345678",
                "Juan",
                "Diego",
                "20260001",
                cursos
        );

        alumno.mostrarCursos();
    }
}
