package backend.project.services;

import backend.project.entities.Reclutador;

public interface ReclutadorService {
    public Reclutador addReclutador(Reclutador reclutador);

    public void deleteReclutador(String id);
}
