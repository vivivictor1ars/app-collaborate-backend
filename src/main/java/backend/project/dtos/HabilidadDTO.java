package backend.project.dtos;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HabilidadDTO {
    private int idHabilidad;
    private String nombreHabilidad;
    private String descripcionHabilidad;
}
