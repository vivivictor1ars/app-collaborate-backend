package backend.project.entities;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
@Entity
@Table(name = "Institucion_Educativa")
public class Institucion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nombre_Institucion", length = 60, nullable = false)//largo de 60 y es obligatorio(nullable)

    private  String nombre_Institucion;
    @Column(name = "correo_Institucion", length = 60, nullable = false)//largo de 60 y es obligatorio(nullable)

    private  String correo_Institucion;

    public Institucion(){

    }
}