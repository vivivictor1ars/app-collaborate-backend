package backend.project.repositories;

import backend.project.entities.Habilidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabilidadRepository extends JpaRepository<Habilidad, Integer> {
    public Habilidad findByDescription(String description);
}
