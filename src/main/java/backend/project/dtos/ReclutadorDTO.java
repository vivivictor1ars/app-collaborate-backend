package backend.project.dtos;

import backend.project.entities.Empresa;
import backend.project.entities.User;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReclutadorDTO {
    private int id;
    private String descripcionReclutador;
    private Empresa empresa;
    private User usuario;
}