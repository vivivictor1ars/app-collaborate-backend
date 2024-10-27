package backend.project.serviceimpl;

import backend.project.dtos.EmpresaMatchDTO;
import backend.project.dtos.EmpresaReclutadorDTO;
import backend.project.entities.Empresa;
import backend.project.repositories.IEmpresaRepository;
import backend.project.services.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpresaServiceImpl implements EmpresaService {
    @Autowired
    private IEmpresaRepository eR;

    @Override
    public void insert(Empresa empresa) {
        eR.save(empresa);
    }
    @Override
    public List<Empresa> list(){
        return eR.findAll();
    }

    @Override
    public void delete(int id) {
        eR.deleteById(id);
    }

    @Override
    public Empresa ListId(int idAuthor) {
        return eR.findById(idAuthor).orElse(new Empresa());
    }

    @Override
    public List<EmpresaReclutadorDTO> reporte01() {
        List<String[]> obtenerNumeroReclutadoresEmpresa = eR.obtenerNumeroReclutadoresEmpresa();
        List<EmpresaReclutadorDTO> EmpresaReclutadorDTOs = new ArrayList<>();

        for (String[] data : obtenerNumeroReclutadoresEmpresa) {
            EmpresaReclutadorDTO dto = new EmpresaReclutadorDTO();
            dto.setNameEmpresa(data[0]);
            dto.setReclutadorCount(Integer.parseInt(data[1]));
            EmpresaReclutadorDTOs.add(dto);
        }

        return EmpresaReclutadorDTOs;
    }

    @Override
    public List<EmpresaMatchDTO> reporte10() {
        List<String[]> MatchEmpresa = eR.MatchEmpresa();
        List<EmpresaMatchDTO> EmpresaMatchDTOs = new ArrayList<>();

        for (String[] data : MatchEmpresa) {
            EmpresaMatchDTO dto = new EmpresaMatchDTO();
            dto.setEmpresam(data[1]);
            dto.setCountestudiantesmatch(Integer.parseInt(data[0]));
            EmpresaMatchDTOs.add(dto);
        }

        return EmpresaMatchDTOs;
    }
}
