package backend.project.repositories;

import backend.project.entities.Carrera;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarreraRepository extends JpaRepository<Carrera, Long> {
    public Carrera findByName(String name);

    @Query(nativeQuery = true, value = "SELECT * FROM carreras ORDER BY name ASC")
    public List<Carrera> listaOrdNameAsc();

    @Query(value = "SELECT c FROM Carrera c ORDER BY c.name DESC")
    public List<Carrera> listaOrdNameDesc();
}
