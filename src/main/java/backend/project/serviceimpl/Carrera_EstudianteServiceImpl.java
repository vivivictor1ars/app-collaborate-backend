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
    private Carrera_EstudianteRepository cR;
    @Override
    public void insertar(Carrera_Estudiante carreras_estudiante) {
        cR.save(carreras_estudiante);
    }
    @Override
    public List<Carrera_Estudiante> listar() {
        return cR.findAll();
    }

    @Override
    public void delete(int id) {
        cR.deleteById(id);
    }

    @Override
    public Carrera_Estudiante ListId(int id) {
        return cR.findById(id).orElse(new Carrera_Estudiante());
    }
}
