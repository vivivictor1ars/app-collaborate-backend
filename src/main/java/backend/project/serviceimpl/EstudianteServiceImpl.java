package backend.project.serviceimpl;

import backend.project.dtos.*;
import backend.project.entities.Estudiante;
import backend.project.repositories.EstudianteRepository;
import backend.project.services.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EstudianteServiceImpl implements EstudianteService {
    @Autowired
    EstudianteRepository estudianteRepository;

    @Override
    public Estudiante addEstudiante(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }

    @Override
    public void deleteEstudiante(Long id) {
        estudianteRepository.deleteById(id);
    }

    @Override
    public List<EstudianteEdadDTO> reporteEdades() {
        List<String[]> mayoresymenores = estudianteRepository.mayoresYmenores();
        List<EstudianteEdadDTO> EstudianteEdadDTOs = new ArrayList<>();
        for (String[] data : mayoresymenores) {
            EstudianteEdadDTO dto = new EstudianteEdadDTO();
            dto.setMayores(Integer.parseInt(data[0]));
            dto.setMenores(Integer.parseInt(data[1]));
            EstudianteEdadDTOs.add(dto);
        }
        return EstudianteEdadDTOs;
    }

    @Override
    public List<EstudianteEdadPromedioDTO> reportePromedio() {
        List<String[]> promedioedad = estudianteRepository.promedioEdad();
        List<EstudianteEdadPromedioDTO> EstudianteEdadPromedioDTOs = new ArrayList<>();

        for (String[] data : promedioedad) {
            EstudianteEdadPromedioDTO dto = new EstudianteEdadPromedioDTO();
            dto.setCountEstudiantes(Integer.parseInt(data[1]));
            dto.setPromedioEdad(Double.parseDouble(data[0]));
            EstudianteEdadPromedioDTOs.add(dto);
        }

        return EstudianteEdadPromedioDTOs;
    }

    @Override
    public List<EstudiantePracticasDTO> reportePracticas() {
        List<String[]> buscapracticasporcentaje = estudianteRepository.buscaPracticasPorcentaje();
        List<EstudiantePracticasDTO> EstudiantePracticasDTOs = new ArrayList<>();

        for (String[] data : buscapracticasporcentaje) {
            EstudiantePracticasDTO dto = new EstudiantePracticasDTO();
            dto.setBuscaPracticas(Integer.parseInt(data[0]));
            dto.setNoBuscaPractica(Integer.parseInt(data[1]));
            EstudiantePracticasDTOs.add(dto);
        }

        return EstudiantePracticasDTOs;
    }

    @Override
    public List<EstudianteSemestreDTO> reporteSemestre() {
        List<String[]> cantidadestudiantesporsemestre = estudianteRepository.cantidadEstudianteBySemestre();
        List<EstudianteSemestreDTO> EstudianteSemestreDTOs = new ArrayList<>();

        for (String[] data : cantidadestudiantesporsemestre) {
            EstudianteSemestreDTO dto = new EstudianteSemestreDTO();
            dto.setCountEstudiantes(Integer.parseInt(data[0]));
            dto.setSemestre(Integer.parseInt(data[1]));
            EstudianteSemestreDTOs.add(dto);
        }

        return EstudianteSemestreDTOs;
    }

    @Override
    public List<InstitucionEstudianteDTO> reporteInstitucion() {
        List<String[]> estudiantesporinstitucion = estudianteRepository.estudiantesByInstitucion();
        List<InstitucionEstudianteDTO> InstitucionEstudianteDTOs = new ArrayList<>();

        for (String[] data : estudiantesporinstitucion) {
            InstitucionEstudianteDTO dto = new InstitucionEstudianteDTO();
            dto.setCountEstudiantes(Integer.parseInt(data[0]));
            dto.setIntitucion(data[1]);
            InstitucionEstudianteDTOs.add(dto);
        }

        return InstitucionEstudianteDTOs;
    }

}
