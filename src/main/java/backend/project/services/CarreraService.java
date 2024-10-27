package backend.project.services;

import backend.project.entities.Carrera;

import java.util.List;

public interface CarreraService {
    public void insert(Carrera carrera);
    List<Carrera> list();
    public void delete(int id);
    public Carrera ListId(int id);
}
