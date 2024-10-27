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
@Table(name = "Postulacion")
public class Postulacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo_match;
    @Column(name = "confirmacion_match", length = 60, nullable = false)
    private boolean confirmacion_match;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "reclutador_id")
    private Reclutador reclutador;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "estudiante_id")
    private Estudiante estudiante;
}

