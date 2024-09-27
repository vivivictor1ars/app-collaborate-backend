package backend.project.repositories;

import backend.project.entities.Institucion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IInstitucionRepository extends JpaRepository<Institucion, Integer> {
}
