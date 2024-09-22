package backend.project.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="habilidad_estudiante")
public class Habilidad_Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="estudiante_id")
    private Estudiante estudiante;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="habilidad_id")
    private Habilidad habilidad;

}
