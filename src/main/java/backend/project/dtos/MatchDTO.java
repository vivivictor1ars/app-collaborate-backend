package backend.project.dtos;

import backend.project.entities.Estudiante;
import backend.project.entities.Reclutador;

public class MatchDTO {
    private int id;
    private int codigo_match;
    private boolean confirmacion_match;
    private Reclutador reclutador;
    private Estudiante estudiante;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodigo_match() {
        return codigo_match;
    }

    public void setCodigo_match(int codigo_match) {
        this.codigo_match = codigo_match;
    }

    public boolean isConfirmacion_match() {
        return confirmacion_match;
    }

    public void setConfirmacion_match(boolean confirmacion_match) {
        this.confirmacion_match = confirmacion_match;
    }

    public Reclutador getReclutador() {
        return reclutador;
    }

    public void setReclutador(Reclutador reclutador) {
        this.reclutador = reclutador;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
}
