package backend.project.dtos;

import backend.project.entities.Reclutador;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Puesto_TrabajoDTO {
    private int id;
    private Reclutador reclutador;
}