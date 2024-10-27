package backend.project.serviceimpl;

import backend.project.entities.Institucion;
import backend.project.repositories.IInstitucionRepository;
import backend.project.services.InstitucionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstitucionServiceImplement implements InstitucionService {
    @Autowired
    private IInstitucionRepository iR;

    @Override
    public void insert(Institucion institucion) {
        iR.save(institucion);
    }
    @Override
    public List<Institucion> list(){
        return iR.findAll();
    }

    @Override
    public void delete(int id) {
        iR.deleteById(id);
    }

    @Override
    public Institucion ListId(int id) {
        return iR.findById(id).orElse(new Institucion());
    }
}
