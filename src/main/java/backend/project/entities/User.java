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

/*
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;
    @Column(name="dni_Usuario",length = 6,nullable = false)
    private int dni_Usuario;
    @Column(name="username", length = 60, nullable = false, unique = true)
    private String username;
    @Column(name="nombre_Usuario",length = 60,nullable = false)
    private String nombre_Usuario;

    @Column(name="correo_Usuario",length = 60,nullable = false)
    private String correo_Usuario;
    @Column(name="contrasena_Usuario",length = 60,nullable = false)
    private String contrasena_Usuario;
    private Boolean enabled;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JsonIgnore
    @JoinColumn(name = "usuario_id")
    private List<Role> roles;

    @Column(name="rol",length = 60,nullable = false)
    private String rol;
    public Usuario() {
    }

    public Usuario(Long idUsuario, int dni_Usuario, String username, String nombre_Usuario, String correo_Usuario, String contrasena_Usuario, Boolean enabled, List<Role> roles, String rol) {
        this.idUsuario = idUsuario;
        this.dni_Usuario = dni_Usuario;
        this.username = username;
        this.nombre_Usuario = nombre_Usuario;
        this.correo_Usuario = correo_Usuario;
        this.contrasena_Usuario = contrasena_Usuario;
        this.enabled = enabled;
        this.roles = roles;
        this.rol = rol;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getDni_Usuario() {
        return dni_Usuario;
    }

    public void setDni_Usuario(int dni_Usuario) {
        this.dni_Usuario = dni_Usuario;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNombre_Usuario() {
        return nombre_Usuario;
    }

    public void setNombre_Usuario(String nombre_Usuario) {
        this.nombre_Usuario = nombre_Usuario;
    }

    public String getCorreo_Usuario() {
        return correo_Usuario;
    }

    public void setCorreo_Usuario(String correo_Usuario) {
        this.correo_Usuario = correo_Usuario;
    }

    public String getContrasena_Usuario() {
        return contrasena_Usuario;
    }

    public void setContrasena_Usuario(String contrasena_Usuario) {
        this.contrasena_Usuario = contrasena_Usuario;
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
 */



