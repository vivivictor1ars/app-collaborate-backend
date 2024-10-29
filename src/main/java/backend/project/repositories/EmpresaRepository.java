package backend.project.repositories;

import backend.project.entities.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
    @Query(value = "SELECT e.name AS name, COUNT(r.id) AS cantReclutadores " +
            "FROM Empresa e " +
            "LEFT JOIN Reclutador r ON e.id = r.empresa_id " +
            "GROUP BY e.name", nativeQuery = true)
    List<String[]> getNumberOfReclutadoresEmpresa();
}
