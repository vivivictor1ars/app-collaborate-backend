package backend.project.dtos

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Carrera_EstudianteDTO {
    // Getter y setter para ID
    private int id;  // ID de la relación
    // Getter y setter para estudianteId
    private int estudianteId;  // ID del estudiante
    // Getter y setter para carreraId
    private int carreraId;  // ID de la carrera

    public Carrera_EstudianteDTO() {}

    public Carrera_EstudianteDTO(int id, int estudianteId, int carreraId) {
        this.id = id;
        this.estudianteId = estudianteId;
        this.carreraId = carreraId;
    }

}
