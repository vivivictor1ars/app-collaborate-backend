package backend.project.serviceimpl;

import backend.project.repositories.CuentaRepository;
import backend.project.services.CuentaService;
import org.springframework.beans.factory.annotation.Autowired;

public class CuentaServiceImpl implements CuentaService {
    @Autowired
    CuentaRepository cuentaRepository;
}
