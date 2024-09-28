package backend.project.dtos;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class EmpresaDTO {
    private int id;  
    private String nombreEmpresa;  
   
  
    private String descripcionEmpresa;  
    
  
    private String correoEmpresa;  

    public EmpresaDTO() {}

    public EmpresaDTO(int id, String nombreEmpresa, String descripcionEmpresa, String correoEmpresa) {
        this.id = id;
        this.nombreEmpresa = nombreEmpresa;
        this.descripcionEmpresa = descripcionEmpresa;
        this.correoEmpresa = correoEmpresa;
    }

}
