import java.util.ArrayList;
import java.util.List;

public class Gestion
{
 private List<Estudiante> estudiantes;
 
   public Gestion () {
        this.estudiantes = new ArrayList<>();
      }
   
   public List<Estudiante>getEstudiante(){
       return estudiantes;
   }
   
   public void  setEstudiante(List<Estudiante>estudiantes){
       this.estudiantes = estudiantes;
   }
      
   public void addEstudiante(Estudiante estudiantes){
       this.estudiantes.add(estudiantes);
   }

   public void listarEstudiantes() {
        System.out.println("Lista de Estudiantes:");
        for (Estudiante estudiante : estudiantes) {
            System.out.println("Nombre: " + estudiante.getNombre() + " " +
                               "Apellido: " + estudiante.getApellido() + " " +
                               "Edad: " + estudiante.getEdad() + " " +
                               "Número de Estudiante: " + estudiante.getCodigo());
        }
     }
   
   public Estudiante buscarEstudiante (String Codigo){
       for (Estudiante estudiante : estudiantes){
           if (estudiante.getCodigo() == Codigo){
               return estudiante;
           }
       }  
       return null;
   }

}
