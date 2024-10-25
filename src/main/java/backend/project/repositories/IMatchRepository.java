package backend.project.repositories;

import backend.project.entities.Postulacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMatchRepository extends JpaRepository<Postulacion, Integer> {
}
