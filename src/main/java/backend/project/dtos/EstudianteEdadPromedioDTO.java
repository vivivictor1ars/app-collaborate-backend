package backend.project.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EstudianteEdadPromedioDTO {
    private Double promedioEdad;
    private Integer countEstudiantes;
}
