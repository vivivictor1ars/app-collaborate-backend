package backend.project.dtos;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EstudianteDTO {
    private int idEstudiante;
    private int semestreEstudiante;
    private int edadEstudiante;
    private String generoEstudiante;
    private boolean practicanteEstudiante;
    private String descripcionEstudiante;
    private int institucionId;
    private int usuarioId;
}
