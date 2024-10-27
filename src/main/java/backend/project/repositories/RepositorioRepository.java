package backend.project.repositories;

import backend.project.entities.Repositorio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepositorioRepository extends JpaRepository<Repositorio, Integer> {
    @Query(value = "SELECT u.Nombre_User AS NombreEstudiante, e.Edad_estudiante AS Edad, e.Practicante_estudiante AS PracticanteEstudiante, COUNT(r.id) AS CantidadRepositorios\n" +
            "FROM users u\n" +
            "JOIN estudiantes e ON u.id_user = e.user_id\n" +
            "LEFT JOIN repositorios r ON e.id_estudiante = r.id_estudiante\n" +
            "GROUP BY u.Nombre_User, e.Edad_estudiante, e.Practicante_estudiante;", nativeQuery = true)
    List<String[]> obtenerNumRepositorios();

}
