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
    EstudianteRepository eR;
}
