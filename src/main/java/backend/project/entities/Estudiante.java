package backend.project.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Estudiante {
    private Long id;
    private String semestre_student;
    private Integer edad_student;
    private String genero;
    private String descripcion;
}
