package backend.project.services;

import backend.project.entities.Carrera_Estudiante;

import java.util.List;

public interface Carrera_EstudianteService {
    public void insertar(Carrera_Estudiante carreras_estudiante);

    List<Carrera_Estudiante> listar();

    public void delete(int id);

    public Carrera_Estudiante ListId(int id);
}
