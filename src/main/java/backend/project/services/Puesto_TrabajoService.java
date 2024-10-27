package backend.project.services;

import backend.project.entities.Puesto_Trabajo;

import java.util.List;

public interface Puesto_TrabajoService {
    public void insertar(Puesto_Trabajo puesto_trabajo);
    List<Puesto_Trabajo> listar();
    public Puesto_Trabajo ListId(int id);
    public void delete(int id);
}
