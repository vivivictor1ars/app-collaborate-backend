package backend.project.serviceimpl;

import backend.project.entities.Repositorio;
import backend.project.repositories.IRepositorioRepository;
import backend.project.services.IRepositorioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RepositorioServiceImplement implements IRepositorioService {
    @Autowired
    private IRepositorioRepository rR;

    @Override
    public void insert(Repositorio repositorio) {
        rR.save(repositorio);
    }

    @Override
    public List<Repositorio> list() {
        return rR.findAll();
    }

    @Override
    public void delete(int id) {
        rR.deleteById(id);
    }

    @Override
    public Repositorio ListId(int id) {
        return rR.findById(id).orElse(new Repositorio());
    }

    @Override
    public List<RepositorioEstudianteDTO> reporte02() {
        List<String[]> obtenerNumRepositorios = rR.obtenerNumRepositorios();
        List<RepositorioEstudianteDTO> RepositorioEstudianteDTOs = new ArrayList<>();

        for (String[] data : obtenerNumRepositorios) {
            RepositorioEstudianteDTO dto = new RepositorioEstudianteDTO();
            dto.setNameEstudiante(data[0]);
            dto.setCorreoEstudiante(data[1]);
            dto.setEdadEstudiante(Integer.parseInt(data[2]));
            dto.setPracticanteEstudiante(Boolean.parseBoolean(data[3]));
            dto.setRepositorioCount(Integer.parseInt(data[4]));
            RepositorioEstudianteDTOs.add(dto);
        }

        return RepositorioEstudianteDTOs;
    }
}
