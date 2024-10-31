package backend.project.serviceimpl;

import backend.project.entities.Habilidad;
import backend.project.repositories.HabilidadRepository;
import backend.project.services.HabilidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabilidadServiceImpl implements HabilidadService {
    @Autowired
    HabilidadRepository habilidadRepository;

    @Override
    public Habilidad addHabilidad(Habilidad habilidad) {
        return habilidadRepository.save(habilidad);
    }

    @Override
    public void deleteHabilidad(String id) {
        habilidadRepository.deleteById(Integer.parseInt(id));
    }
}
