package backend.project.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Repositorio {
    private Long id;
    private String nombre_repository;
    private String descripcion_repository;
    private String enlace_repository;
    private String fecha_repository;
    private Estudiante estudiante;
}
