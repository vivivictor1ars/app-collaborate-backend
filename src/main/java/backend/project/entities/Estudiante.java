package backend.project.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Estudiantes")
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer semestre_Estudiante;
    private Integer edad_Estudiante;
    private String genero_Estudiante;
    private Boolean practicante_Estudiante;
    private String descripcion_Estudiante;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "Institucion_educativa_id")
    private Institucion institucion_Estudiante;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "Usuario_id")
    private User user_Estudiante;
}