package backend.project.dtos;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class InstitucionDTO {
    private int id;  // ID de la institución
    private String nombreInstitucion;  // Nombre de la institución
    private String correoInstitucion;  // Correo de la institución
}