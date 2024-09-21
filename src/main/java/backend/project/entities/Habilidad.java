package backend.project.entities;
import jakarta.persistence.*;
@Entity
@Table(name="Habilidades")
public class Habilidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "descripcion_Habilidad", length = 60, nullable = false)//largo de 60 y es obligatorio(nullable)
    private  String descripcion_Habilidad;

    public Habilidad(){

    }

    public Habilidad(int id, String descripcion_Habilidad) {
        this.id = id;
        this.descripcion_Habilidad = descripcion_Habilidad;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion_Habilidad() {
        return descripcion_Habilidad;
    }

    public void setDescripcion_Habilidad(String descripcion_Habilidad) {
        this.descripcion_Habilidad = descripcion_Habilidad;
    }
}

//se cambia y se pone Habilidad por Requisito
/*
import javax.persistence.*;

@Entity
@Table(name="Requisitos")
public class Requisito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "descripcion_Requisito", length = 60, nullable = false)//largo de 60 y es obligatorio(nullable)
    private  String descripcion_Requisito;


    public Requisito(){

    }

    public Requisito(int id, String descripcion_Requisito) {
        this.id = id;
        this.descripcion_Requisito = descripcion_Requisito;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion_Requisito() {
        return descripcion_Requisito;
    }

    public void setDescripcion_Requisito(String descripcion_Requisito) {
        this.descripcion_Requisito = descripcion_Requisito;
    }
}

 */