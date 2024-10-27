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
    private int id;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "Estudiante_id")
    private Estudiante estudiante;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "Carrera_id")
    private Carrera carrera;
}
