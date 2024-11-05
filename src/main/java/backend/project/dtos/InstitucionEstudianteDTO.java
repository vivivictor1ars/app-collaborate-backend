package backend.project.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InstitucionEstudianteDTO {
    private String intitucion;
    private Integer countEstudiantes;
}
