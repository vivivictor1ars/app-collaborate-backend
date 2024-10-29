package backend.project.repositories;

import backend.project.entities.Portafolio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PortafolioRepository extends JpaRepository<Portafolio, Integer> {
    @Query(nativeQuery = true, value = "SELECT u.username AS username, e.edad AS edad, " +
            "e.practicante AS practicante, COUNT(p.id) AS cantPortafolios" +
            "FROM Users u" +
            "JOIN Estudiante e ON u.id = e.user_id" +
            "LEFT JOIN Portafolio p ON e.id = p.estudiante_id" +
            "GROUP BY u.username, e.edad, e.practicante;")
    List<String[]> getNumberOfPortafolios();
}
