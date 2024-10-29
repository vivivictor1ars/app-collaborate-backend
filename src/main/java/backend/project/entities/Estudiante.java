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
@Table(name = "Estudiantes")
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer semestre;
    private Integer edad;
    private String genero;
    private Boolean practicante;
    private String description;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "institucion_id")
    private Institucion institucion;

    @JsonIgnore
    @OneToMany(mappedBy = "estudiante", fetch = FetchType.EAGER)
    private List<Carrera_Estudiante> carreras_estudiantes;

    @JsonIgnore
    @OneToMany(mappedBy = "estudiante", fetch = FetchType.EAGER)
    private List<Portafolio> portafolios;
}