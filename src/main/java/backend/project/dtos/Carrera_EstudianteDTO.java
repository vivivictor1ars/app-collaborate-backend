package backend.project.dtos;

import backend.project.entities.Carrera;
import backend.project.entities.Estudiante;

public class Carrera_EstudianteDTO {
    private int id;
    private Estudiante estudiante;
    private Carrera carrera;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }
}
