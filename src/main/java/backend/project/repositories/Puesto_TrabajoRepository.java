package backend.project.repositories;

import backend.project.entities.Puesto_Trabajo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Puesto_TrabajoRepository extends JpaRepository<Puesto_Trabajo, Integer> {
}