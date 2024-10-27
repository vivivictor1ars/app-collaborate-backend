package backend.project.serviceimpl;

import backend.project.dtos.ReclutadorMatchDTO;
import backend.project.entities.Empresa;
import backend.project.entities.Reclutador;
import backend.project.repositories.ReclutadorRepository;
import backend.project.services.ReclutadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReclutadorServiceImpl implements ReclutadorService {
    @Autowired
    private ReclutadorRepository rR;

    @Override
    public void insert(Reclutador reclutador) {
        rR.save(reclutador);
    }

    @Override
    public List<Reclutador> listar() {
        return rR.findAll();
    }

    @Override
    public void delete(int id) {
        rR.deleteById(id);
    }

    @Override
    public Reclutador ListId(int id) {
        return rR.findById(id).orElse(new Reclutador());
    }

    @Override
    public List<Reclutador> buscarEmpresa(Empresa Empresa_id) {
        return rR.findBynombreEmpresa(Empresa_id);
    }

    @Override
    public List<ReclutadorMatchDTO> reporte09() {
        List<String[]> MatchReclutador = rR.MatchReclutador();
        List<ReclutadorMatchDTO> ReclutadorMatchDTOs = new ArrayList<>();

        for (String[] data : MatchReclutador) {
            ReclutadorMatchDTO dto = new ReclutadorMatchDTO();
            dto.setReclutadorm(data[1]);
            dto.setCountestudiantesmatch(Integer.parseInt(data[0]));
            ReclutadorMatchDTOs.add(dto);
        }

        return ReclutadorMatchDTOs;
    }
}
