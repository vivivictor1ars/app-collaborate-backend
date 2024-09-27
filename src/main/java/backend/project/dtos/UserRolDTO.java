package backend.project.dtos;

public class UserRolDTO {
    private int countusuarios;
    private String rol;

    public UserRolDTO() {
    }

    public UserRolDTO(int countusuarios, String rol) {
        this.countusuarios = countusuarios;
        this.rol = rol;
    }

    public int getCountusuarios() {
        return countusuarios;
    }

    public void setCountusuarios(int countusuarios) {
        this.countusuarios = countusuarios;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
