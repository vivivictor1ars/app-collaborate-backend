package backend.project.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Institucion_Educativa")
public class Institucion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private  String nombre_Institucion;
    private  String correo_Institucion;

    @JsonIgnore
    @OneToMany(mappedBy = "institucion", fetch = FetchType.EAGER)
    private List<Estudiante> estudiantes;
}