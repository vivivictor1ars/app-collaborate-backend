package backend.project.services;

import backend.project.dtos.RepositorioEstudianteDTO;
import backend.project.entities.Repositorio;

import java.util.List;

public interface RepositorioService {
    public void insert(Repositorio repositorio);

    List<Repositorio> list();

    public void delete(int id);

    public Repositorio ListId(int id);

    public List<RepositorioEstudianteDTO> reporte02();

}
