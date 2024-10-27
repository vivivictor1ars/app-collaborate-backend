package backend.project.repositories;

import backend.project.entities.Postulacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostulacionRepository extends JpaRepository<Postulacion, Integer> {
}
