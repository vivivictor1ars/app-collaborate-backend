package backend.project.dtos;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReclutadorMatchDTO {
    private int countEstudiantesMatch;  // Conteo de estudiantes en el match
    private String reclutador;  // Nombre del reclutador asociado
}
