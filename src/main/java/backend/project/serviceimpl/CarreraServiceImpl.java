package backend.project.serviceimpl;

import backend.project.entities.Carrera;
import backend.project.repositories.ICarreraRepository;
import backend.project.services.CarreraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarreraServiceImpl implements CarreraService {
    @Autowired
    private ICarreraRepository eR;

    @Override
    public void insert(Carrera carrera) {
        eR.save(carrera);
    }
    @Override
    public List<Carrera> list(){
        return eR.findAll();
    }

    @Override
    public void delete(int id) {
        eR.deleteById(id);
    }

    @Override
    public Carrera ListId(int idAuthor) {
        return eR.findById(idAuthor).orElse(new Carrera());
    }
}
