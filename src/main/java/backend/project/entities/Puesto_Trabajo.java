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
@Table(name = "Puesto_Trabajos")
public class Puesto_Trabajo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "habilidad_id")
    private Habilidad habilidad;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "reclutador_id")
    private Reclutador reclutador;
}