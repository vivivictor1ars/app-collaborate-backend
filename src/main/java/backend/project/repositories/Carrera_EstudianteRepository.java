package backend.project.repositories;

import backend.project.entities.Carrera_Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Carrera_EstudianteRepository extends JpaRepository<Carrera_Estudiante, Integer> {
}
