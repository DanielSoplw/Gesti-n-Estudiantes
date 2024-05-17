public class Estudiante{ 
  private String nombre, apellido, codigo;
  private int edad; 
  
    public Estudiante() {
    }

    public Estudiante(String nombre, String apellido, String codigo, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigo = codigo;
        this.edad = edad;
    }
  
    public String getNombre() {
        return nombre;
     }

    public String getApellido() {
        return apellido;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
  
  
    
}
