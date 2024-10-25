package backend.project.serviceimpl;

import backend.project.entities.Postulacion;
import backend.project.repositories.IMatchRepository;
import backend.project.services.IMatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchServiceImplement implements IMatchService {
    @Autowired
    private IMatchRepository mR;
    @Override
    public void insertar(Postulacion postulacion) {
        mR.save(postulacion);
    }
    @Override
    public List<Postulacion> listar() {
        return mR.findAll();
    }

    @Override
    public void delete(int id) {
        mR.deleteById(id);
    }

    @Override
    public Postulacion ListId(int id) {
        return mR.findById(id).orElse(new Postulacion());
    }
}
