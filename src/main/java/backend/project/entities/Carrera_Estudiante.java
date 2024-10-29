package backend.project.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Carreras_Estudiantes")
public class Carrera_Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "estudiante_id")
    private Estudiante estudiante;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "carrera_id")
    private Carrera carrera;
}
