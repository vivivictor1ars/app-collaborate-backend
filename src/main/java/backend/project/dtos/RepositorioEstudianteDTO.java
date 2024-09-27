package backend.project.dtos;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RepositorioEstudianteDTO {
    private String nameEstudiante;
    private String correoEstudiante;
    private int edadEstudiante;
    private boolean practicanteEstudiante;
    private int repositorioCount;
}
