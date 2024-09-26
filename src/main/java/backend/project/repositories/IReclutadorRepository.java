package backend.project.repositories;

import backend.project.entities.Empresa;
import backend.project.entities.Reclutador;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IReclutadorRepository extends JpaRepository<Reclutador, Integer> {

    @Query("from Reclutador v where v.empresa =:empresa")
    List<Reclutador> findBynombreEmpresa(@Param("empresa") Empresa empresa);

    @Query(value = "select count(distinct m.estudiante_id) as EstudiantesMatch, u.nombre_user as Reclutador\n" +
            "from match m\n" +
            "join reclutadores r on r.id=m.reclutador_id\n" +
            "join users u on r.user_id=u.id_user\n" +
            "group by u.nombre_user", nativeQuery = true)
    List<String[]> MatchReclutador();
}
