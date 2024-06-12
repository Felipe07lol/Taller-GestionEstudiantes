
/**
 * Write a description of class Estudiante here.
 * 
 * @author (Luis Felipe) 
 * @version (15/05/2024)
 */
public class Estudiante 
{
    public String nombre;
    public String apellido;
    public String edad;
    public String codigo;  
    
    //Constructor
    public Estudiante(String nombre, String apellido, String edad, String codigo)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.codigo = codigo;
    }
    
    //Get and Set
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEdad() {
        return edad;
    }

    public String getCodigo() {
        return codigo;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
}


