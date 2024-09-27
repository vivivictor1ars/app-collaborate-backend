package backend.project.serviceimpl;

import backend.project.entities.Puesto_Trabajo;
import backend.project.repositories.IPuesto_TrabajoRepository;
import backend.project.services.IPuesto_TrabajoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Puesto_TrabajoServiceImplement implements IPuesto_TrabajoService {
    @Autowired
    private IPuesto_TrabajoRepository pR;
    @Override
    public void insertar(Puesto_Trabajo puesto_trabajo) {
        pR.save(puesto_trabajo);
    }
    @Override
    public List<Puesto_Trabajo> listar() {
        return pR.findAll();
    }

    @Override
    public Puesto_Trabajo ListId(int id) {
        return pR.findById(id).orElse(new Puesto_Trabajo());
    }

    @Override
    public void delete(int id) {
        pR.deleteById(id);
    }
}
