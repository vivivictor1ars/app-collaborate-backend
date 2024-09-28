package backend.project.dtos;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Carrera_EstudianteDTO {
    private int id;  
    private int estudianteId;  
    
    private int carreraId;  // ID de la carrera

    public Carrera_EstudianteDTO() {}

    public Carrera_EstudianteDTO(int id, int estudianteId, int carreraId) {
        this.id = id;
        this.estudianteId = estudianteId;
        this.carreraId = carreraId;
    }

}
