package backend.project.services;

import backend.project.entities.Puesto_Trabajo;

import java.util.List;

public interface Puesto_TrabajoService {
    public Puesto_Trabajo addPuestoTrabajo(Puesto_Trabajo puesto_trabajo);

    public void deletePuestoTrabajo(Long id);
}
