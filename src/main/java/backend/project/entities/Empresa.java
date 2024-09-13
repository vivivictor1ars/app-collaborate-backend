package backend.project.entities;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "Empresa")
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nombre_Empresa", length = 60, nullable = false)//largo de 60 y es obligatorio(nullable)
    private  String nombre_Empresa;
    @Column(name = "descripcion_Empresa", length = 60, nullable = false)//largo de 60 y es obligatorio(nullable)
    private  String descripcion_Empresa;
    @Column(name = "correo_Empresa", length = 60, nullable = false)//largo de 60 y es obligatorio(nullable)
    private  String correo_Empresa;

    public Empresa(){

    }
}
