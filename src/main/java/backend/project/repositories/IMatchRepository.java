package backend.project.repositories;

import backend.project.entities.Match;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMatchRepository extends JpaRepository<Match, Integer> {
}
