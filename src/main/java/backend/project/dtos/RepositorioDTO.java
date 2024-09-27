package backend.project.dtos;

import backend.project.entities.Estudiante;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RepositorioDTO {
    private int id;  // ID del repositorio
    private String nombreRepositorio;  // Nombre del repositorio
    private String descripcionRepositorio;  // Descripción del repositorio
    private String enlaceRepositorio;  // Enlace del repositorio
    private LocalDate fechaRepositorio;  // Fecha del repositorio
    private Estudiante estudiante;  // Estudiante asociado al repositorio
}