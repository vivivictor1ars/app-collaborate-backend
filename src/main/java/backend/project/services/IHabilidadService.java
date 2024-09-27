package backend.project.services;

import backend.project.entities.Habilidad;

import java.util.List;

public interface IHabilidadService {
    public void insert(Habilidad habilidad);
    List<Habilidad> list();

    public void delete(int id);

    public Habilidad ListId(int id);
}
