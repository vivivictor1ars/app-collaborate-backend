package backend.project.repositories;

import backend.project.entities.Empresa;
import backend.project.entities.Reclutador;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReclutadorRepository extends JpaRepository<Reclutador, Integer> {
    @Query(nativeQuery = true, value= "SELECT e.name AS name +" +
            "FROM Empresa e +" +
            "JOIN Reclutador r ON e.id = r.empresa_id +" +
            "GROUP BY e.name;")
    public List<Reclutador> findByNameEmpresa(Empresa empresa);
}
