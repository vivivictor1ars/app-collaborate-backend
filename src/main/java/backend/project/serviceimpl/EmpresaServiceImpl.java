package backend.project.serviceimpl;

import backend.project.repositories.EmpresaRepository;
import backend.project.services.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpresaServiceImpl implements EmpresaService {
    @Autowired
    EmpresaRepository empresaRepository;

    @Override
    public Integer getNumberOfReclutadores() {
        Integer cantReclutados = 0;
        cantReclutados = empresaRepository.getNumberOfReclutadoresEmpresa().size();
        return cantReclutados;
    }
}
