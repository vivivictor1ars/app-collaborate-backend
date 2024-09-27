package backend.project.entities;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUser;
    @Column(name="dni_User",length = 6,nullable = false)
    private int dni_User;
    @Column(name="username", length = 60, nullable = false, unique = true)
    private String username;
    @Column(name="nombre_User",length = 60,nullable = false)
    private String nombre_User;

    @Column(name="correo_User",length = 60,nullable = false)
    private String correo_User;
    @Column(name="contrasena_User",length = 60,nullable = false)
    private String contrasena_User;
    private Boolean enabled;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JsonIgnore
    @JoinColumn(name = "User_id")
    private List<Role> roles;

    @Column(name="rol",length = 60,nullable = false)
    private String rol;
    public User() {
    }

    public User(Long idUser, int dni_User, String username, String nombre_User, String correo_User, String contrasena_User, Boolean enabled, List<Role> roles, String rol) {
        this.idUser = idUser;
        this.dni_User = dni_User;
        this.username = username;
        this.nombre_User = nombre_User;
        this.correo_User = correo_User;
        this.contrasena_User = contrasena_User;
        this.enabled = enabled;
        this.roles = roles;
        this.rol = rol;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public int getDni_User() {
        return dni_User;
    }

    public void setDni_User(int dni_User) {
        this.dni_User = dni_User;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNombre_User() {
        return nombre_User;
    }

    public void setNombre_User(String nombre_User) {
        this.nombre_User = nombre_User;
    }

    public String getCorreo_User() {
        return correo_User;
    }

    public void setCorreo_User(String correo_User) {
        this.correo_User = correo_User;
    }

    public String getContrasena_User() {
        return contrasena_User;
    }

    public void setContrasena_User(String contrasena_User) {
        this.contrasena_User = contrasena_User;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}



