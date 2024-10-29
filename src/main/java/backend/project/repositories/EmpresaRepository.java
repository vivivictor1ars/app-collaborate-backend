package backend.project.repositories;

import backend.project.entities.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
    @Query(value = "SELECT e.nombre_Empresa AS NombreEmpresa, COUNT(r.id) AS CantidadReclutadores " +
            "FROM Empresa e " +
            "LEFT JOIN reclutadores r ON e.id = r.Empresa_id " +
            "GROUP BY e.nombre_Empresa", nativeQuery = true)
    List<String[]> obtenerNumeroReclutadoresEmpresa();

    @Query(value = "select count(distinct m.estudiante_id) as EstudiantesMatch, e.nombre_empresa as Empresa\n" +
            "from match m\n" +
            "join reclutadores r on r.id=m.reclutador_id\n" +
            "join empresa e on r.empresa_id=e.id\n" +
            "group by e.nombre_empresa", nativeQuery = true)
    List<String[]> MatchEmpresa();
}
