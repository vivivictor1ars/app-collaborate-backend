package backend.project.dtos;

import backend.project.entities.Habilidad;
import backend.project.entities.Reclutador;

public class Puesto_TrabajoDTO {
    private int id;

    private Habilidad habilidad;

    private Reclutador reclutador;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Habilidad getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(Habilidad habilidad) {
        this.habilidad = habilidad;
    }

    public Reclutador getReclutador() {
        return reclutador;
    }

    public void setReclutador(Reclutador reclutador) {
        this.reclutador = reclutador;
    }
}
