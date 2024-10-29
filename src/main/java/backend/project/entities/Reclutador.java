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
@Table(name = "Reclutadores")
public class Reclutador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    @JsonIgnore
    @OneToMany(mappedBy = "reclutador", fetch = FetchType.EAGER)
    private List<Postulacion> postulaciones;

    @JsonIgnore
    @OneToMany(mappedBy = "reclutador", fetch = FetchType.EAGER)
    private List<Puesto_Trabajo> puestos_trabajos;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "empresa_id")
    private Empresa empresa;

    @OneToOne
    @JsonIgnore
    @JoinColumn(name = "user_id")
    private User user;
}

