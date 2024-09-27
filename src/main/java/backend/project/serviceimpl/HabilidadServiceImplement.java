package backend.project.serviceimpl;

import backend.project.entities.Habilidad;
import backend.project.repositories.IHabilidadRepository;
import backend.project.services.IHabilidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HabilidadServiceImplement implements IHabilidadService {
    @Autowired
    private IHabilidadRepository rR;

    @Override
    public void insert(Habilidad habilidad) {
        rR.save(habilidad);
    }
    @Override
    public List<Habilidad> list(){
        return rR.findAll();
    }

    @Override
    public void delete(int id) {
        rR.deleteById(id);
    }

    @Override
    public Habilidad ListId(int idAuthor) {
        return rR.findById(idAuthor).orElse(new Habilidad());
    }
}
