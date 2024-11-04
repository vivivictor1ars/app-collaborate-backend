package backend.project.repositories;

import backend.project.entities.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {
    @Query(value = "select count(e.estudiante_id) as cantidadEstudiante, e.semestre as SemestreEstudiante" +
            "FROM Estudiantes e" +
            "GROUP BY e.semestre;", nativeQuery = true)
    List<String[]> cantidadEstudianteBySemestre();

    @Query(value = "select round(avg(e.edad),3) as edadPromedio, count(e.estudiante_id) as totalEstudiantes" +
            "from Estudiantes e;", nativeQuery = true)
    List<String[]> promedioEdad();

    @Query(value = "select count(case when e.edad > 20 then 1 end) as EstudiantesMayores" +
            "  count(case when e.edad <= 20 then 1 end) as EstudiantesMenores" +
            "from Estudiantes e;", nativeQuery = true)
    List<String[]> mayoresYmenores();
    @Query(value = "select (count(case when e.practicante = true then 1 end)*100/count(*)) as PorcentajeBuscaPracticas" +
            "(count(case when e.practicante = false then 1 end)*100/count(*)) as PorcentajeNoBuscaPracticas\n" +
            "from Estudiantes e;", nativeQuery = true)
    List<String[]> buscaPracticasPorcentaje();
    @Query(value = "select count(e.estudiante_id) as CantidadEstudiantes, i.name as Institucion" +
            "from Estudiantes e" +
            "join Institucion_Educativa i on i.id = e.institucion_id" +
            "group by i.name", nativeQuery = true)
    List<String[]> estudiantesByInstitucion();
}
