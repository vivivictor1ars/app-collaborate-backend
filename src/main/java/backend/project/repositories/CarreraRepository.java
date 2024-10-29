package backend.project.repositories;

import backend.project.entities.Carrera;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarreraRepository extends JpaRepository<Carrera, Long> {
    public Carrera findByName(String name);
}
