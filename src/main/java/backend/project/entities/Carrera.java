package backend.project.entities;

import jdk.jfr.DataAmount;

import javax.persistence.*;


@Entity
@Table(name = "Carreras")
public class Carrera {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre_Carrera;
}