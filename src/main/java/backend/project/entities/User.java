package backend.project.entities;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUser;
    @Column(name="username", length = 60, nullable = false, unique = true)
    private String username;
    @Column(name="nombre_User",length = 60,nullable = false)
    private String nombre_User;
    @Column(name="contrasena_User",length = 60,nullable = false)
    private String contrasena_User;
    private Boolean enabled;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JsonIgnore
    @JoinColumn(name = "user_id")
    private List<Role> roles;

    @Column(name="rol",length = 60,nullable = false)
    private String rol;
    public User() {
    }

    public User(Long idUser, String username, String nombre_User, String contrasena_User, Boolean enabled, List<Role> roles, String rol) {
        this.idUser = idUser;
        this.username = username;
        this.nombre_User = nombre_User;
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

    public String getUsername(){
        return username;
    }
    public void setUsername(String username) {

        this.username = username;
    }

    public String getNombre_User(){
        return nombre_User;
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
//ROL REEMPLAZA POR AUTHORITY
//cambiamos usuario por user - USER es paraa nuestro trabajo