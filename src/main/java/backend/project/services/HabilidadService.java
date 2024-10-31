package backend.project.services;

import backend.project.entities.Habilidad;

public interface HabilidadService {
    public Habilidad addHabilidad(Habilidad habilidad);

    public void deleteHabilidad(String id);
}
