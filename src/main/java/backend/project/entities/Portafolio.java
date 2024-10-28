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
public class Portafolio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nombreRepositorio;
    private String descripcionRepositorio;
    private String enlaceRepositorio;
    private LocalDate fechaRepositorio;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "estudiante_id")
    private Estudiante estudiante;
}