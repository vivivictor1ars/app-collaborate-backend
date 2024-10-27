package backend.project.serviceimpl;

import backend.project.entities.Empresa;
import backend.project.repositories.EmpresaRepository;
import backend.project.services.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpresaServiceImpl implements EmpresaService {
    @Autowired
    EmpresaRepository eR;
}
