package backend.project.serviceimpl;

import backend.project.entities.Reclutador;
import backend.project.repositories.ReclutadorRepository;
import backend.project.services.ReclutadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReclutadorServiceImpl implements ReclutadorService {
    @Autowired
    ReclutadorRepository reclutadorRepository;

    @Override
    public Reclutador addReclutador(Reclutador reclutador) {
        return reclutadorRepository.save(reclutador);
    }

    @Override
    public void deleteReclutador(String id) {
        reclutadorRepository.deleteById(Integer.parseInt(id));
    }
}
