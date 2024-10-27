package backend.project.serviceimpl;

import backend.project.entities.Carrera_Estudiante;
import backend.project.repositories.Carrera_EstudianteRepository;
import backend.project.services.Carrera_EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Carrera_EstudianteServiceImpl implements Carrera_EstudianteService {
    @Autowired
    Carrera_EstudianteRepository cR;
}
