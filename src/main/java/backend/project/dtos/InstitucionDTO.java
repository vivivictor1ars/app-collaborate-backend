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
    private int id;  
    private String nombreInstitucion;  
    private String correoInstitucion;  // Correo de la institución
}
