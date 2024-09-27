package backend.project.dtos;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmpresaMatchDTO {
    private int countEstudiantesMatch;  // Conteo de estudiantes en el match
    private String empresa;  // Nombre de la empresa asociada al match

    public void setCountestudiantesmatch(int i) {
    }

    public void setEmpresam(String datum) {
    }
}