package backend.project.serviceimpl;

import backend.project.entities.Puesto_Trabajo;
import backend.project.repositories.Puesto_TrabajoRepository;
import backend.project.services.Puesto_TrabajoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Puesto_TrabajoServiceImpl implements Puesto_TrabajoService {
    @Autowired
    Puesto_TrabajoRepository puesto_trabajoRepository;

    @Override
    public Puesto_Trabajo addPuestoTrabajo(Puesto_Trabajo puesto_trabajo) {
        return puesto_trabajoRepository.save(puesto_trabajo);
    }

    @Override
    public void deletePuestoTrabajo(Long id) {
        puesto_trabajoRepository.deleteById(id);
    }
}
