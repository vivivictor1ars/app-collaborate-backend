package backend.project.services;

import backend.project.entities.Empresa;
import backend.project.entities.Reclutador;

import java.util.List;

public interface ReclutadorService {
    public void insert(Reclutador reclutador);
    List<Reclutador> listar();
    public void delete(int id);
    public Reclutador ListId(int id);
    List<Reclutador> buscarEmpresa(Empresa Empresa_id);
    public List<ReclutadorMatchDTO> reporte09();
}
