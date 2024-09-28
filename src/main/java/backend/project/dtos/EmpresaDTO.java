package backend.project.dtos;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class EmpresaDTO {
    private int id;  
    // Getter para nombreEmpresa
    private String nombreEmpresa;  // Nombre de la empresa
    // Setter para descripcionEmpresa
    // Getter para descripcionEmpresa
    private String descripcionEmpresa;  // Descripción de la empresa
    // Setter para correoEmpresa
    // Getter para correoEmpresa
    private String correoEmpresa;  // Correo de la empresa

    public EmpresaDTO() {}

    public EmpresaDTO(int id, String nombreEmpresa, String descripcionEmpresa, String correoEmpresa) {
        this.id = id;
        this.nombreEmpresa = nombreEmpresa;
        this.descripcionEmpresa = descripcionEmpresa;
        this.correoEmpresa = correoEmpresa;
    }

}
