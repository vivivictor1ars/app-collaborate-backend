package backend.project.services;

import backend.project.entities.Institucion;

import java.util.List;

public interface IInstitucionService {
    public void insert(Institucion institucion);
    List<Institucion> list();

    public void delete(int id);

    public Institucion ListId(int id);
}
