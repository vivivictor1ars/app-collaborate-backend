package backend.project.dtos;

import backend.project.entities.Empresa;
import backend.project.entities.User;

public class ReclutadorDTO {
    private int id;

    private String Descripcion_Reclutador;

    private Empresa empresa;

    private User user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion_Reclutador() {
        return Descripcion_Reclutador;
    }

    public void setDescripcion_Reclutador(String descripcion_Reclutador) {
        Descripcion_Reclutador = descripcion_Reclutador;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
