package backend.project.serviceimpl;

import backend.project.entities.Habilidad;
import backend.project.repositories.HabilidadRepository;
import backend.project.services.HabilidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HabilidadServiceImpl implements HabilidadService {
    @Autowired
    HabilidadRepository rR;
}
