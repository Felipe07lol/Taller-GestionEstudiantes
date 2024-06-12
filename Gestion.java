import java.util.ArrayList;
import java.util.List;

/**
 * Write a description of class Gestion here.
 * 
 * @author (Luis Felipe) 
 * @version (15/05/2024)
 */
public class Gestion
{
    private List<Estudiante>estudiantes = new ArrayList<Estudiante>();
    
    
    public Gestion()
    {
    }
    
    public List<Estudiante>getEstudiante()
    {
        return estudiantes;
    }

    
    public void setEstudiante(List<Estudiante>estudiantes)
    {
        this.estudiantes = estudiantes;
    }
    
    
    public void addEstudiante (Estudiante estudiantes)
    {
        this.estudiantes.add(estudiantes);
    }
}