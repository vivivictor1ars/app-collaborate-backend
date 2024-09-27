package backend.project.dtos;

import lombok.Getter;
import lombok.Setter;

public class EmpresaReclutadorDTO {
    private String NameEmpresa;
    @Setter
    @Getter
    private int cantidadReclutadores;

    public EmpresaReclutadorDTO() {}

    public EmpresaReclutadorDTO(String nombreEmpresa, int cantidadReclutadores) {
        this.NameEmpresa = nombreEmpresa;
        this.cantidadReclutadores = cantidadReclutadores;
    }

    public String getNombreEmpresa() {
        return NameEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.NameEmpresa = nombreEmpresa;
    }

    public void setNameEmpresa(String datum) {

    }

    public void setReclutadorCount(int i) {
    }
}
