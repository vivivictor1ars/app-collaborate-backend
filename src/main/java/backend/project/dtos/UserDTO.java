package backend.project.dtos;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import backend.project.entities.Role;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private Long idUsuario;
    private int dniUsuario;
    private String username;
    private String nombreUsuario;
    private String correoUsuario;
    private String contrasenaUsuario;
    private Boolean enabled;
    private List<Role> roles;
    private String rol;
}
