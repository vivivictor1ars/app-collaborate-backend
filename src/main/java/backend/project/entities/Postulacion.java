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
@Table(name = "Postulacion")
public class Postulacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer number_postulacion;
    private Boolean confirmation;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "reclutador_id")
    private Reclutador reclutador;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "estudiante_id")
    private Estudiante estudiante;
}

