package backend.project.services;

import backend.project.entities.Postulacion;

import java.util.List;

public interface IMatchService {
    public void insertar(Postulacion postulacion);

    List<Postulacion> listar();

    public void delete(int id);

    public Postulacion ListId(int id);
}
