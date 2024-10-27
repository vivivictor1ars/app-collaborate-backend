package backend.project.services;

import backend.project.entities.Empresa;

import java.util.List;

public interface EmpresaService {
    public void insert(Empresa empresa);
    List<Empresa> list();
    public void delete(int id);
    public Empresa ListId(int id);
    public List<EmpresaReclutadorDTO> reporte01();
    public List<EmpresaMatchDTO> reporte10();

}
