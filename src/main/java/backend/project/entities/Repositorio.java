package backend.project.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Repositorios")
public class Repositorio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nombreRepositorio;
    private String descripcionRepositorio;
    private String enlaceRepositorio;
    private LocalDate fechaRepositorio;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "idEstudiante")
    private Estudiante estudiante;
}