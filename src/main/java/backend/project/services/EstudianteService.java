package backend.project.services;

import backend.project.dtos.*;
import backend.project.entities.Estudiante;

import java.util.List;

public interface EstudianteService {
    public Estudiante addEstudiante(Estudiante estudiante);
    public void deleteEstudiante(Long id);
    public List<EstudianteEdadDTO> reporteEdades();
    public List<EstudianteEdadPromedioDTO> reportePromedio();
    public List<EstudiantePracticasDTO> reportePracticas();
    public List<EstudianteSemestreDTO> reporteSemestre();
    public List<InstitucionEstudianteDTO> reporteInstitucion();
}
