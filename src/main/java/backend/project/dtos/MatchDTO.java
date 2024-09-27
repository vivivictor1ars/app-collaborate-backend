package backend.project.dtos;

import backend.project.entities.Estudiante;
import backend.project.entities.Reclutador;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MatchDTO {
    private int id;  // ID del match
    private String codigoMatch;  // Código del match
    private boolean confirmacionMatch;  // Confirmación del match
    private Reclutador reclutador;  // Reclutador asociado al match
    private Estudiante estudiante;  // Estudiante asociado al match
}